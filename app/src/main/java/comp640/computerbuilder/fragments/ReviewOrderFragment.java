package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import comp640.computerbuilder.R;
import comp640.computerbuilder.dummy.DummyParts;

/**
 * Created by deandubois on 4/26/16.
 */
public class ReviewOrderFragment extends CBFragment {


    public ReviewOrderFragment()
    {
        _title = "Review Order";
        _parentID = R.id.myCart;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_review_order, container, false);
        return rootView;
    }
}
