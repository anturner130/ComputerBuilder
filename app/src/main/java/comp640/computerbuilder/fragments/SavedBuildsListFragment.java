package comp640.computerbuilder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import comp640.computerbuilder.R;
import comp640.computerbuilder.logic.SavedBuildsViewAdapter;
import comp640.computerbuilder.model.build.Build;
import comp640.computerbuilder.model.build.OnBuildsChangedListener;
import comp640.computerbuilder.model.build.SavedBuilds;

/**
 * Created by alexanderturner on 4/17/16.
 * Represents the screen of saved builds.
 */
public class SavedBuildsListFragment extends Fragment implements OnBuildsChangedListener{

    private OnListFragmentInteractionListener _listener;
    private SavedBuildsViewAdapter _adapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SavedBuildsListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_build_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            _adapter = new SavedBuildsViewAdapter(SavedBuilds.getSingleton().getBuilds(), _listener);
            recyclerView.setAdapter(_adapter);
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            _listener = (OnListFragmentInteractionListener) context;
            SavedBuilds.getSingleton().registerOnBuildsChangedListener(this);
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        SavedBuilds.getSingleton().unregisterOnBuildsChangedListener(this);
        _listener = null;
        _adapter = null;
    }

    @Override
    public void onBuildsChanged() {
        if(_adapter != null){
            _adapter.notifyDataSetChanged();
        }
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
        void onListFragmentInteraction(Build item);
    }
}
