package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import comp640.computerbuilder.R;

/**
 * Created by alexanderturner on 4/19/16.
 */
public class HelpFragment extends CBFragment {
    public HelpFragment(){
        _title = "Help";
        _index = 5;
    }
    private Button _checkOutButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_help, container, false);

        _checkOutButton=(Button)view.findViewById(R.id.checkOutButton);

        _checkOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                createSubfragment(new PaymentInfoFragment());
            }
        });
        return view;
    }
}
