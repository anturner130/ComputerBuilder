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

import comp640.computerbuilder.R;
import comp640.computerbuilder.fragments.PartListFragment.OnListFragmentInteractionListener;
import comp640.computerbuilder.fragments.PartListFragment.OnOnListFragmentLongClickListener;

import comp640.computerbuilder.model.parts.Part;

import java.io.InputStream;
import java.util.List;

/**

 * TODO: Replace the implementation with code for your data type.
 * TODO: Research custom list adapter and implement it to work with part.
 * TODO: Make generic enough to handle different kinds of parts
 * TODO: Replace "DummyItem" with a class that represents a part
 */
public class PartViewAdapter extends RecyclerView.Adapter<PartViewAdapter.ViewHolder> {

    private final int MAX_CONTENT_STRING_LENGTH = 150;
    private final int MAX_NAME_STRING_LENGTH = 40;
    private final List<Part> mValues;
    private final OnListFragmentInteractionListener mListener;
    private final OnOnListFragmentLongClickListener mLongListener;

    public PartViewAdapter(List<Part> items, OnListFragmentInteractionListener listener, OnOnListFragmentLongClickListener longListener) {
        mValues = items;
        mListener = listener;
        mLongListener = longListener;
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

        if(holder.mContentView.getText().length() > MAX_CONTENT_STRING_LENGTH){
            holder.mContentView.setText(
                    holder.mContentView.getText().toString().substring(0, MAX_CONTENT_STRING_LENGTH) + "...");
        }
        if(holder.mIdView.getText().length() > MAX_NAME_STRING_LENGTH){
            holder.mIdView.setText(
                    holder.mIdView.getText().toString().substring(0, MAX_NAME_STRING_LENGTH) + "...");
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

        holder.mView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(null != mLongListener) {
                    mLongListener.onListFragmentLongClick(holder, position);
                }
                return true;
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

        public void removeItem()
        {
            notifyDataSetChanged();
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
            if(_imageView != null && result != null) {
                Bitmap image = Bitmap.createScaledBitmap(result, _imageView.getWidth(), _imageView.getHeight(), true);
                _part.setImage(image);
                _imageView.setImageBitmap(image);
            }
        }
    }
}
