package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import comp640.computerbuilder.R;
import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.logic.SettingsReference;

/**
 * Created by alexanderturner on 4/19/16.
 */
public class SettingsFragment extends CBFragment implements CompoundButton.OnCheckedChangeListener{
    /**
     * Switches
     */
    private Switch _tipsSwitch;
    private Switch _warningsSwitch;

    public SettingsFragment(){
        _title = "Settings";
        _index = 4;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        _tipsSwitch = (Switch)view.findViewById(R.id.tipsSwitch);
        _warningsSwitch = (Switch)view.findViewById(R.id.warningsSwitch);

        _tipsSwitch.setChecked(SettingsReference.getReference().getDisplayTips());
        _warningsSwitch.setChecked(SettingsReference.getReference().getDisplayWarnings());

        _tipsSwitch.setOnCheckedChangeListener(this);
        _warningsSwitch.setOnCheckedChangeListener(this);

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(compoundButton.equals(_tipsSwitch))
            DataController.getController().getSettings().setDisplayTips(compoundButton.isChecked());
        else if (compoundButton.equals(_warningsSwitch))
            DataController.getController().getSettings().setDisplayWarnings(compoundButton.isChecked());
    }
}
