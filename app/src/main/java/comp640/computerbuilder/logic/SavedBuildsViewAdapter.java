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
import comp640.computerbuilder.fragments.SavedBuildsListFragment.OnListFragmentInteractionListener;
import comp640.computerbuilder.model.build.Build;


import java.io.InputStream;
import java.util.List;

/**
 * Created by alexanderturner on 4/17/16.
 * Represents the list adapter for saved builds.
 */
public class SavedBuildsViewAdapter extends RecyclerView.Adapter<SavedBuildsViewAdapter.ViewHolder>{

    private final List<Build> _values;
    private final OnListFragmentInteractionListener _listener;

    public SavedBuildsViewAdapter(List<Build> items, OnListFragmentInteractionListener listener) {
        _values = items;
        _listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_build, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder._item = _values.get(position);
        if(holder._item.getImageURL() != null)
            new DownloadImageTask(holder._imageView)
                    .execute(holder._item.getImageURL());


        holder._nameView.setText(String.format("Name : %s",holder._item.getName()));
        holder._priceView.setText(String.format("Price : %s", holder._item.getPrice()));
        holder._styleView.setText(String.format("Style : %s", holder._item.getStyle().toString()));
        holder._storesView.setText(String.format("Store(s) : %s", holder._item.getStores()));
        holder._minBudgetView.setText(String.format("Min Budget : %s", holder._item.getBudgetMin()));
        holder._maxBudgetView.setText(String.format("Max Budget : %s", holder._item.getBudgetMax()));

        holder._view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != _listener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    _listener.onListFragmentInteraction(holder._item);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return _values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View _view;
        public final ImageView _imageView;
        public final TextView _nameView;
        public final TextView _priceView;
        public final TextView _styleView;
        public final TextView _storesView;
        public final TextView _minBudgetView;
        public final TextView _maxBudgetView;
        public Build _item;

        public ViewHolder(View view) {
            super(view);
            _view = view;
            _imageView = (ImageView) view.findViewById(R.id.buildImage);
            _nameView = (TextView)view.findViewById(R.id.name);
            _priceView = (TextView)view.findViewById(R.id.price);
            _styleView = (TextView)view.findViewById(R.id.style);
            _storesView = (TextView)view.findViewById(R.id.stores);
            _minBudgetView = (TextView)view.findViewById(R.id.minBudget);
            _maxBudgetView = (TextView)view.findViewById(R.id.maxBudget);
        }

    }

    /**
     * Class to download an image from a URL in the background
     */
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView _imageView;

        public DownloadImageTask(ImageView imageView) {
            _imageView = imageView;
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
            _imageView.setImageBitmap(result);
        }
    }
}
