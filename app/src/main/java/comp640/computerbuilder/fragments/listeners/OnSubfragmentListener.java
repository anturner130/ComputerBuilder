package comp640.computerbuilder.fragments.listeners;


import comp640.computerbuilder.fragments.CBFragment;

/**
 * Created by alexanderturner on 4/20/16.
 */
public interface OnSubfragmentListener {
    void onCreateSubfragment(CBFragment fragment);
    void onRemoveSubfragment(CBFragment fragment);
}
