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
<<<<<<< HEAD

import android.widget.EditText;
=======
>>>>>>> master
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

import comp640.computerbuilder.R;
import comp640.computerbuilder.activities.MenuActivity;
import comp640.computerbuilder.dummy.DummyCart;
import comp640.computerbuilder.dummy.DummyParts;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;



/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends CBFragment {

<<<<<<< HEAD
    private Button _checkOutButton;

=======
    private Button _checkOut;
    private TextView _totalText;
>>>>>>> master

    public CartFragment(){
        _title = "My Cart";
        _index = 3;

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
                createSubfragment(new ReviewOrderFragment());
            }
        });

        //Create a new part list fragment and insert it into this fragment
        Fragment fragment = new PartListFragment();
        //Set the content of the cart
        //((PartListFragment)fragment).setContent(new DummyParts().getParts());
        //Use the child fragment manager to nest fragments
        //DummyParts.getSingleton().getParts(PartType.Audio_Video_Card).add(new Part(456, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
         //       "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
         //       ((PartListFragment) fragment).setContent(
        //        DummyParts.getSingleton().getParts(PartType.Audio_Video_Card)
       // );
        ((PartListFragment)fragment).setContent(DummyCart.getSingleton().getParts());
        getChildFragmentManager().beginTransaction().add(R.id.list_cart, fragment).commit();
        getChildFragmentManager().executePendingTransactions();
        updateTotal();


       _checkOutButton=(Button)rootView.findViewById(R.id.checkOutButton);

        _checkOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
               createSubfragment(new PaymentInfoFragment());
          }
        });


        return rootView;


    }


}

