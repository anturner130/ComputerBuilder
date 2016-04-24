package comp640.computerbuilder.fragments;

import java.util.HashMap;

import comp640.computerbuilder.fragments.listeners.OnOptionClickedListener;
import comp640.computerbuilder.fragments.listeners.OnSubfragmentListener;

/**
 * Created by alexanderturner on 4/18/16.
 */
public class CBFragment extends android.support.v4.app.Fragment {
    private OnSubfragmentListener _listener;

    protected int _parentID = -1;

    protected String _title;

    protected int _index =-1;

    public String getTitle(){return _title;}

    HashMap<Integer,OnOptionClickedListener> _options;

    public void setOnSubfragmentListener(OnSubfragmentListener listener){
        _listener = listener;
    }

    protected void createSubfragment(CBFragment fragment){
        _listener.onCreateSubfragment(fragment);
    }

    protected void removeSubfragment(CBFragment fragment){
        _listener.onRemoveSubfragment(fragment);
    }

    public void addMenuOption(int resourceId, OnOptionClickedListener listener){
        _options.put(resourceId, listener);
    }

    public OnOptionClickedListener getOptionClickedListener(int resourceId){
        return _options.get(resourceId);
    }

    public int getParentID(){return _parentID;}

    public int getIndex(){return _index;}
}
