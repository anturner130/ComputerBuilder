package comp640.computerbuilder.fragments;

import java.util.List;

import comp640.computerbuilder.fragments.listeners.OnSubfragmentListener;
import comp640.computerbuilder.model.parts.Part;

/**
 * Created by alexanderturner on 4/18/16.
 */
public class CBFragment extends android.support.v4.app.Fragment {
    private OnSubfragmentListener _listener;

    protected int _parentID = -1;

    protected String _title;

    protected int _index =-1;


    public String getTitle(){return _title;}

    public void setOnSubfragmentListener(OnSubfragmentListener listener){
        _listener = listener;
    }

    protected void createSubfragment(CBFragment fragment){
        _listener.onCreateSubfragment(fragment);
    }

    protected void removeSubfragment(CBFragment fragment){
        _listener.onRemoveSubfragment(fragment);
    }

    public int getParentID(){return _parentID;}

    public int getIndex(){return _index;}


}
