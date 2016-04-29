package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import comp640.computerbuilder.R;
import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.logic.SettingsReference;
/**
 * Created by Brian on 4/25/2016.
 */
public class PaymentInfoFragment extends CBFragment implements CompoundButton.OnCheckedChangeListener{
    /**
     * Switches
     */

    private Button _placeOrderButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);



        return view;
    }

    }