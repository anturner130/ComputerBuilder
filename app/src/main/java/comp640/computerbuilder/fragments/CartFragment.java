package comp640.computerbuilder.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Locale;

import comp640.computerbuilder.R;

/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends android.support.v4.app.Fragment {

    public CartFragment(){
        //Empty constructor required by the fragment
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);

        return rootView;
    }
}

