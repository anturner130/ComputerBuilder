package comp640.computerbuilder.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;

import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Locale;

import comp640.computerbuilder.R;
import comp640.computerbuilder.dummy.DummyParts;

/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends CBFragment {

    public CartFragment(){
        _title = "My Cart";
        _index = 3;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);
        Fragment fragment = new PartListFragment();
        ((PartListFragment)fragment).setContent(new DummyParts().getParts());
        getChildFragmentManager().beginTransaction().add(R.id.list_cart, fragment).commit();
        getChildFragmentManager().executePendingTransactions();

        return rootView;
    }


}

