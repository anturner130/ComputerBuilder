package comp640.computerbuilder.fragments;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.databind.util.EnumValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import comp640.computerbuilder.R;
import comp640.computerbuilder.fragments.listeners.OnFragmentCompleteListener;
import comp640.computerbuilder.model.build.Build;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.build.BuildStyle;
import comp640.computerbuilder.model.build.CurrentBuild;

/**
 * Created by alexanderturner on 4/17/16.
 * Represents the screen to create a new build
 */
public class AddBuildFragment extends Fragment implements SeekBar.OnSeekBarChangeListener,
        View.OnClickListener{


    /**
     * Holds the name edit text.
     */
    private EditText _nameEditText;

    /**
     * Holds the min budget seek bar.
     */
    private SeekBar _minBudgetBar;

    /**
     * Holds the max budget seek bar.
     */
    private SeekBar _maxBudgetBar;

    /**
     * Holds the min budget text view.
     */
    private TextView _minBudgetTextView;

    /**
     * Holds the max budget text view.
     */
    private TextView _maxBudgetTextView;

    /**
     * Holds the stores spinner.
     */
    private Spinner _storesSpinner;

    /**
     * Holds the styles spinner.
     */
    private Spinner _stylesSpinner;

    /**
     * The button to submit the form.
     */
    private Button _submitButton;

    /**
     * The fragment complete listener.
     */
    private OnFragmentCompleteListener _listener;

    /**
     * Required empty public constructor
     */
    public AddBuildFragment(){}


    /**
     * Sets the OnFragmentCompleteListener
     * @param listener the listener.
     */
    public void setOnFragmentCompleteListener(OnFragmentCompleteListener listener){
        _listener = listener;
    }

    /**
     * Creates the views and wires the UI
     * @param inflater the layout inflater
     * @param container the container
     * @param savedInstanceState the bundle
     * @return the view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_add_build, container, false);

        _nameEditText = (EditText)view.findViewById(R.id.buildName);
        _minBudgetBar = (SeekBar)view.findViewById(R.id.minBudgetBar);
        _maxBudgetBar = (SeekBar)view.findViewById(R.id.maxBudgetBar);
        _minBudgetTextView = (TextView)view.findViewById(R.id.minBudget);
        _maxBudgetTextView = (TextView)view.findViewById(R.id.maxBudget);
        _storesSpinner = (Spinner)view.findViewById(R.id.storesSpinner);
        _stylesSpinner = (Spinner)view.findViewById(R.id.stylesSpinner);
        _submitButton = (Button)view.findViewById(R.id.submitButton);

        _minBudgetBar.setOnSeekBarChangeListener(this);
        _maxBudgetBar.setOnSeekBarChangeListener(this);

        _minBudgetBar.setMax(1000);
        _maxBudgetBar.setMax(1000);

        _stylesSpinner.setAdapter(new ArrayAdapter<String>(getContext(),
                R.layout.support_simple_spinner_dropdown_item, getStyles()));
        _storesSpinner.setAdapter(new ArrayAdapter<String>(getContext(),
                R.layout.support_simple_spinner_dropdown_item, getStores()));

        _stylesSpinner.setSelection(0);
        _storesSpinner.setSelection(0);

        _submitButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar == _minBudgetBar){
            if(_maxBudgetBar.getProgress() < _minBudgetBar.getProgress())
                _maxBudgetBar.setProgress(_maxBudgetBar.getProgress());
        }

        if(seekBar.getProgress() >= seekBar.getMax()) {
            seekBar.setMax(seekBar.getMax() * 2);
            seekBar.clearFocus();
        }

        //Display
        _minBudgetTextView.setText("$ " + _minBudgetBar.getProgress());
        _maxBudgetTextView.setText("$ " + _maxBudgetBar.getProgress());
    }

    /**
     * Gets a list of styles
     * @return the styles
     */
    private List<String> getStyles(){
        List<String> temp = new ArrayList<>();
        for (BuildStyle style: BuildStyle.values())
            temp.add(style.toString());

        return temp;
    }

    /**
     * Gets a list of stores
     * @return the stores
     */
    private List<String> getStores(){
        List<String> temp = new ArrayList<>();
        for (BuildStore store: BuildStore.values())
            temp.add(store.toString());

        return temp;
    }


    @Override
    public void onClick(View view) {
        if(view == _submitButton){

            if(_nameEditText.getText().toString().equals("")){
                Toast.makeText(getContext(),"Error: Name field is empty", Toast.LENGTH_SHORT).show();
                return;
            }

            if(_maxBudgetBar.getProgress() == 0){
                Toast.makeText(getContext(),"Error: Max budget is 0", Toast.LENGTH_SHORT).show();
                return;
            }

            List<BuildStore> stores = new ArrayList<>();
            stores.add(BuildStore.valueOf((String) _storesSpinner.getSelectedItem()));

            Build build = new Build(_nameEditText.getText().toString(),
                    _minBudgetBar.getProgress(),
                    _maxBudgetBar.getProgress(),
                    BuildStyle.valueOf((String)_stylesSpinner.getSelectedItem()),
                    stores);
            CurrentBuild.getSingleton().setCurrentBuild(build);
            _listener.onFragmentComplete();
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
