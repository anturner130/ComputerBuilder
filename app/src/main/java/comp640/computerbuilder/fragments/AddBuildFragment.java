package comp640.computerbuilder.fragments;


import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import comp640.computerbuilder.R;
import comp640.computerbuilder.model.build.Build;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.build.BuildStyle;
import comp640.computerbuilder.model.build.CurrentBuild;
import comp640.computerbuilder.model.build.SavedBuilds;

/**
 * Created by alexanderturner on 4/17/16.
 * Represents the screen to create a new build
 */
public class AddBuildFragment extends CBFragment implements SeekBar.OnSeekBarChangeListener,
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
     * Required empty public constructor
     */
    public AddBuildFragment(){
        _title = "Add Build";
        _index = 0;
        _parentID = R.id.savedBuild;
    }

    /**
     * Creates the views and wires the UI
     * @param inflater the layout inflater
     * @param container the container
     * @param savedInstanceState the bundle
     * @return the view
     */
    @TargetApi(16)
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

        int srcColor = getResources().getColor(R.color.colorPrimary);
        _minBudgetBar.getProgressDrawable()
                .setColorFilter(new PorterDuffColorFilter(srcColor, PorterDuff.Mode.SRC_IN));
        _maxBudgetBar.getProgressDrawable()
                .setColorFilter(new PorterDuffColorFilter(srcColor, PorterDuff.Mode.SRC_IN));
        _minBudgetBar.getThumb()
                .setColorFilter(new PorterDuffColorFilter(srcColor, PorterDuff.Mode.SRC_IN));
        _maxBudgetBar.getThumb()
                .setColorFilter(new PorterDuffColorFilter(srcColor, PorterDuff.Mode.SRC_IN));
        _nameEditText.getBackground()
                .setColorFilter(new PorterDuffColorFilter(srcColor, PorterDuff.Mode.SRC_IN));

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
    public void onProgressChanged(final SeekBar seekBar, int i, boolean b) {
        try {

            int minProgress = _minBudgetBar.getProgress();
            int maxProgress = _maxBudgetBar.getProgress();

            if (maxProgress < minProgress)
                _maxBudgetBar.setProgress(minProgress);


            if (seekBar.getProgress() >= seekBar.getMax()) {
                seekBar.setEnabled(false);
                seekBar.setFocusable(false);
                seekBar.setClickable(false);
                seekBar.clearFocus();
                seekBar.setMax(seekBar.getMax() * 2);
            }

            if (seekBar.getProgress() == 0) {
                seekBar.setMax(500);
            }

            //Display
            _minBudgetTextView.setText("$ " + _minBudgetBar.getProgress());
            _maxBudgetTextView.setText("$ " + _maxBudgetBar.getProgress());

            if (!seekBar.isEnabled()) {
                Handler handler = new Handler(Looper.myLooper());
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seekBar.setEnabled(true);
                        seekBar.setFocusable(true);
                        seekBar.setClickable(true);
                    }
                }, 250);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
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

            if(!checkNameEligible(_nameEditText.getText().toString())){
                Toast.makeText(getContext(),"Error: Build name already exists", Toast.LENGTH_SHORT).show();
                return;
            }

            if(_maxBudgetBar.getProgress() == 0){
                Toast.makeText(getContext(),"Error: Max budget is 0", Toast.LENGTH_SHORT).show();
                return;
            }

            List<BuildStore> stores = new ArrayList<>();
            stores.add(BuildStore.valueOf(((String) _storesSpinner.getSelectedItem())
                    .replace(" ","_")));

            Build build = new Build(_nameEditText.getText().toString(),
                    _minBudgetBar.getProgress(),
                    _maxBudgetBar.getProgress(),
                    BuildStyle.valueOf(((String)_stylesSpinner.getSelectedItem()).replace(" ", "_")),
                    stores);
            CurrentBuild.getSingleton().setCurrentBuild(build);
            createSubfragment(new ComputerBreakdownFragment());
        }
    }

    /**
     * Checks to see if the name is in use already
     * @return true if the name is eligible
     */
    private boolean checkNameEligible(String name){
        for (Build build: SavedBuilds.getSingleton().getBuilds()) {
            if(build.getName().equals(name))
                return false;
        }
        return true;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }


}
