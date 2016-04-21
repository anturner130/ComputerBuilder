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
    private static final String NO_IMAGE_URL = "http://www.thewoodjoynt.com" +
            "/Content/Images/Products/NoImageAvailable.jpg";

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

        String url;
        if(holder._item.getImageURL() != null && !holder._item.getImageURL().equals(""))
            url = holder._item.getImageURL();
        else
            url = NO_IMAGE_URL;
        new DownloadImageTask(holder._imageView)
                .execute(url);


        holder._nameView.setText(String.format("Name : %s",holder._item.getName()));
        holder._priceView.setText(String.format("Price : %s", holder._item.getPrice()));
        holder._styleView.setText(String.format("Style : %s", holder._item.getStyle().toString()));


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

        public Build _item;

        public ViewHolder(View view) {
            super(view);
            _view = view;
            _imageView = (ImageView) view.findViewById(R.id.buildImage);
            _nameView = (TextView)view.findViewById(R.id.name);
            _priceView = (TextView)view.findViewById(R.id.price);
            _styleView = (TextView)view.findViewById(R.id.style);

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
            Bitmap image = Bitmap.createScaledBitmap(result, _imageView.getWidth(), _imageView.getHeight(), true);
            _imageView.setImageBitmap(image);
        }
    }
}
