package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.R;
import comp640.computerbuilder.fragments.listeners.OnOptionClickedListener;
import comp640.computerbuilder.logic.PartFilter;
import comp640.computerbuilder.logic.SortType;
import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.build.BuildStyle;
import comp640.computerbuilder.model.parts.Part;

/**
 * Created by alexanderturner on 4/28/16.
 */
public class FilterFragment extends CBFragment implements SeekBar.OnSeekBarChangeListener {

    /**
     * UI Elements
     */
    private SeekBar minPriceSeekBar;
    private SeekBar maxPriceSeekBar;
    private TextView minPriceTextView;
    private TextView maxPriceTextView;
    private Spinner sortBySpinner;
    private Spinner brandSpinner;
    private Spinner retailerSpinner;
    public static OnFilterCompleteListener listener;
    public static List<Part> parts;


    public FilterFragment()
    {
        _title = "Parts Filter";
        addMenuOption(R.menu.filter, new OnOptionClickedListener() {
            @Override
            public void onClick() {
                removeTopFragment();
            }
        });
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_filter, container, false);

        minPriceTextView = (TextView)view.findViewById(R.id.minPrice);
        maxPriceTextView = (TextView)view.findViewById(R.id.maxPrice);
        minPriceSeekBar = (SeekBar)view.findViewById(R.id.minPriceBar);
        maxPriceSeekBar = (SeekBar)view.findViewById(R.id.maxPriceBar);
        sortBySpinner = (Spinner)view.findViewById(R.id.sortSpinner);
        brandSpinner = (Spinner)view.findViewById(R.id.brandSpinner);
        retailerSpinner = (Spinner)view.findViewById(R.id.retailerSpinner);

        minPriceSeekBar.setOnSeekBarChangeListener(this);
        maxPriceSeekBar.setOnSeekBarChangeListener(this);


        setUpSeekerBars();
        setUpSpinners();

        return view;
    }

    /**
     * UI setup
     */
    private void setUpSeekerBars(){

    }
    private void setUpSpinners(){

        List<String> sortBy = new ArrayList<>();
        for (SortType type: SortType.values())
            sortBy.add(type.toString());

        sortBySpinner.setAdapter(
                new ArrayAdapter<String>(getContext(),
                        R.layout.support_simple_spinner_dropdown_item, sortBy));
        sortBySpinner.setSelection(0);


        List<String> brands = new ArrayList<>();
        brands.add("None");
        for (Part part: parts)
            if(!brands.contains(part.getBrand()))
                brands.add(part.getBrand());

        brandSpinner.setAdapter(
                new ArrayAdapter<String>(getContext(),
                        R.layout.support_simple_spinner_dropdown_item, brands));
        brandSpinner.setSelection(0);

        List<String> stores = new ArrayList<>();
        for (BuildStore store: BuildStore.values())
            stores.add(store.toString());

        retailerSpinner.setAdapter(
        new ArrayAdapter<String>(getContext(),
                R.layout.support_simple_spinner_dropdown_item, stores));

        retailerSpinner.setSelection(0);
    }

    @Override
    public void onProgressChanged(final SeekBar seekBar, int i, boolean b) {
        try {

            int minPrice = minPriceSeekBar.getProgress();
            int maxPrice = maxPriceSeekBar.getProgress();

            if (maxPrice < minPrice)
                maxPriceSeekBar.setProgress(minPrice);


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
            minPriceTextView.setText("$ " + minPriceSeekBar.getProgress());
            maxPriceTextView.setText("$ " + maxPriceSeekBar.getProgress());

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

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onDetach() {
        super.onDetach();
        PartFilter filter = PartFilter.getFilter();
        filter.setSortType(SortType.valueOf(sortBySpinner.getSelectedItem().toString().replace(" ", "_")));
        filter.setBrand(brandSpinner.getSelectedItem().toString());
        filter.setStore(BuildStore.valueOf(retailerSpinner.getSelectedItem().toString().replace(" ", "_")));
        filter.setMinPrice(minPriceSeekBar.getProgress());
        filter.setMaxPrice(maxPriceSeekBar.getProgress());
        if(listener != null){
            listener.OnFilterComplete();
            listener = null;
        }
    }

    public interface OnFilterCompleteListener{
        void OnFilterComplete();
    }
}
