package comp640.computerbuilder.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import comp640.computerbuilder.logic.BreakdownViewAdapter;

import comp640.computerbuilder.model.build.CurrentBuild;
import comp640.computerbuilder.model.parts.PartType;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComputerBreakdownFragment extends CBFragment implements View.OnClickListener,
        OnListFragmentInteractionListener {

    /**
     * The text view for the budget;
     */
    private TextView _priceTextView;

    /**
     * The text view for the budget;
     */
    private TextView _budgetTextView;

    /**
     * The list view of parts;
     */
    private RecyclerView _partsRecyclerView;

    /**
     * The submit button
     */
    private Button _submitButton;


    public ComputerBreakdownFragment() {
        _title = CurrentBuild.getSingleton().getCurrentBuild().getName();
        _parentID = R.id.savedBuild;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_computer_breakdown, container, false);

        _budgetTextView = (TextView)view.findViewById(R.id.budgetTextView);
        _priceTextView = (TextView)view.findViewById(R.id.priceTextView);
        _partsRecyclerView = (RecyclerView)view.findViewById(R.id.partsRecyclerView);
        _submitButton = (Button) view.findViewById(R.id.submitButton);

        _submitButton.setOnClickListener(this);

        setupTextViews();
        setupPartsListView();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        setupTextViews();
        setupPartsListView();
    }

    @Override
    public void onClick(View view) {
        if(view == _submitButton)
            tryFinishBuild();
    }

    private void setupTextViews(){
        if(_budgetTextView != null && _priceTextView != null){
            int price = CurrentBuild.getSingleton().getCurrentBuild().getPrice();
            int budgetRemaining = CurrentBuild.getSingleton().getCurrentBuild().getBudgetMax() -
                    price;
            _priceTextView.setText("$" + price );
            _budgetTextView.setText("$" + budgetRemaining);
        }

    }

    private void setupPartsListView(){
        if(_partsRecyclerView != null){
            _partsRecyclerView.setAdapter(new BreakdownViewAdapter(
                    CurrentBuild.getSingleton().getCurrentBuild(),
                    this));
            _partsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
    }

    private void tryFinishBuild(){

        if(!CurrentBuild.getSingleton().getCurrentBuild().isBuildComplete())
            Toast.makeText(getContext(),"Build missing parts", Toast.LENGTH_LONG).show();
        else {
            DummyCart.getSingleton().add(CurrentBuild.getSingleton().getCurrentBuild().getParts());
            createSubfragment(new CartFragment());
        }
    }

    @Override
    public void onInteraction(BreakdownViewAdapter.ViewHolder viewHolder, int position) {
        PartListFragment fragment = new PartListFragment();
        fragment.setDummyPartType(PartType.values()[position]);
        createSubfragment(fragment);
    }



}
