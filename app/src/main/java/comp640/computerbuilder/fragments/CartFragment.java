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

import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

import comp640.computerbuilder.R;
import comp640.computerbuilder.activities.MenuActivity;
import comp640.computerbuilder.dummy.DummyCart;
import comp640.computerbuilder.dummy.DummyParts;
import comp640.computerbuilder.fragments.listeners.OnOptionClickedListener;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;



/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends CBFragment {


    private Button _checkOut;
    private TextView _totalText;


    public CartFragment(){
        _title = "My Cart";
        _index = 3;
        addMenuOption(R.menu.add_build, new OnOptionClickedListener() {
            @Override
            public void onClick() {
                createSubfragment(new IndividualPartFragment());
            }
        });
    }

    public void updateTotal()
    {
        int total = 0;
        for(Part p: DummyCart.getSingleton().getParts())
        {
            total+=p.getPrice();

        }
        _totalText.setText("Total: $" + total);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);

        //Link the checkout button and set it's on click listener
        _totalText = (TextView) rootView.findViewById(R.id.cart_total);
        _checkOut = (Button) rootView.findViewById(R.id.button_checkout);
        _checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Send to the review order fargment which has yet to be implemented
                createSubfragment(new PaymentInfoFragment());
            }
        });

        //Create a new part list fragment and insert it into this fragment
        Fragment fragment = new PartListFragment();
        //Set the content of the cart
        ((PartListFragment)fragment).setContent(DummyCart.getSingleton().getParts());
        getChildFragmentManager().beginTransaction().add(R.id.list_cart, fragment).commit();
        getChildFragmentManager().executePendingTransactions();
        updateTotal();



        return rootView;


    }


}

