package comp640.computerbuilder.logic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import comp640.computerbuilder.R;
import comp640.computerbuilder.fragments.PartListFragment.OnListFragmentInteractionListener;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 * TODO: Research custom list adapter and implement it to work with part.
 * TODO: Make generic enough to handle different kinds of parts
 * TODO: Replace "DummyItem" with a class that represents a part
 */
public class PartViewAdapter extends RecyclerView.Adapter<PartViewAdapter.ViewHolder> {

    private final List<Part> mValues;
    private final OnListFragmentInteractionListener mListener;

    public PartViewAdapter(List<Part> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_part, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).getName());
        holder.mContentView.setText(mValues.get(position).getDescription());
        holder.mPriceView.setText("$"+holder.mItem.getPrice());
        if(holder.mItem.getImage() == null) {
            String url = holder.mItem.getUrl();
            new DownloadImageTask(holder.mImageView, holder.mItem)
                    .execute(url);
        }else{
            holder.mImageView.setImageBitmap(holder.mItem.getImage());
        }
        switch (holder.mItem.getStore())
        {
            case Amazon:
                holder.mStoreView.setImageResource(R.mipmap.ic_amazon);
                break;
            case Newegg:
                holder.mStoreView.setImageResource(R.mipmap.ic_newegg);
                break;
            case Multiple_Stores:

                break;
        }










        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder, position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public final ImageView mImageView;
        public final TextView mPriceView;
        public final ImageView mStoreView;
        public Part mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
            mImageView = (ImageView) view.findViewById(R.id.imageView);
            mPriceView = (TextView) view.findViewById(R.id.part_price);
            mStoreView = (ImageView) view.findViewById(R.id.ic_store);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView _imageView;
        Part _part;

        public DownloadImageTask(ImageView imageView, Part part) {
            _imageView = imageView;
            this._part = part;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap image = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                image = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return image;
        }

        protected void onPostExecute(Bitmap result) {
            Bitmap image = Bitmap.createScaledBitmap(result, _imageView.getWidth(), _imageView.getHeight(), true);
            _part.setImage(image);
            _imageView.setImageBitmap(image);
        }
    }
}
