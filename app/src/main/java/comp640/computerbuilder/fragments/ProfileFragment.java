package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import comp640.computerbuilder.R;

/**
 * Created by deandubois on 5/2/16.
 */
public class ProfileFragment extends CBFragment {
    public ProfileFragment(){
        _title = "My Profile";
        _index = 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
