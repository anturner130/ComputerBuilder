package comp640.computerbuilder.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;

import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

import comp640.computerbuilder.R;
import comp640.computerbuilder.dummy.DummyParts;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends CBFragment {

    Button _checkOut;

    public CartFragment(){
        _title = "My Cart";
        _index = 3;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);

        //Link the checkout button and set it's on click listener
        _checkOut = (Button) container.findViewById(R.id.button_checkout);
        _checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Create a new part list fragment and insert it into this fragment
        Fragment fragment = new PartListFragment();
        //Set the content of the cart
        //((PartListFragment)fragment).setContent(new DummyParts().getParts());
        //Use the child fragment manager to nest fragments
        ((PartListFragment)fragment).setContent(
                DummyParts.getSingleton().getParts(PartType.CPU)
        );
        getChildFragmentManager().beginTransaction().add(R.id.list_cart, fragment).commit();
        getChildFragmentManager().executePendingTransactions();

        return rootView;
    }


}

