package comp640.computerbuilder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import comp640.computerbuilder.dummy.DummyParts;
import comp640.computerbuilder.logic.PartViewAdapter;
import comp640.computerbuilder.R;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class PartListFragment extends CBFragment {

    public void setContent(List<Part> content) {

        this.content = content;
    }

    public void setDummyPartType(PartType type){
        setContent(DummyParts.getSingleton().getParts(type));
        _title = type.toString();
    }

    public List<Part> content;
    /**
     * The fragment interaction listener.
     */
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PartListFragment() {
        _parentID = R.layout.fragment_computer_breakdown;
    }

    /**
     * The view is created within this method.
     * @param inflater the layout inflater.
     * @param container the container of the layout.
     * @param savedInstanceState the bundle.
     * @return
     */
    //TODO: replace "Dummy.Items" to a list of parts
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_part_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new PartViewAdapter(content, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name

        void onListFragmentInteraction(PartViewAdapter.ViewHolder viewHolder, int position);
    }
}
