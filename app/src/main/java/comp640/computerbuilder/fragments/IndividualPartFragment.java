package comp640.computerbuilder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import comp640.computerbuilder.R;
import comp640.computerbuilder.dummy.DummyCart;
import comp640.computerbuilder.fragments.listeners.OnListFragmentInteractionListener;
import comp640.computerbuilder.fragments.listeners.OnOptionClickedListener;
import comp640.computerbuilder.logic.BreakdownViewAdapter;
import comp640.computerbuilder.logic.BuyPartViewAdapter;
import comp640.computerbuilder.logic.PartFilter;
import comp640.computerbuilder.logic.PartViewAdapter;
import comp640.computerbuilder.model.build.CurrentBuild;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/6/16.
 */
public class IndividualPartFragment extends CBFragment implements
        OnListFragmentInteractionListener {
    /**
     * The list view of parts;
     */
    private RecyclerView _partsRecyclerView;




    public IndividualPartFragment() {
        _title = "Buy Individual Parts";
        _index = 2;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_individual_parts, container, false);


        _partsRecyclerView = (RecyclerView)view.findViewById(R.id.individualRecyclerView);

        setupPartsListView();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        setupPartsListView();
    }



    private void setupPartsListView(){
        if(_partsRecyclerView != null){
            _partsRecyclerView.setAdapter(new BreakdownViewAdapter(null, this));
            _partsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
    }

    @Override
    public void onInteraction(BreakdownViewAdapter.ViewHolder viewHolder, int position) {
        PartListFragment fragment = new PartListFragment();
        fragment.setParent(R.id.individualParts);
        fragment.setDummyPartType(PartType.values()[position]);
        createSubfragment(fragment);
    }

}
