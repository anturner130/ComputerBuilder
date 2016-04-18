package comp640.computerbuilder.backend.listeners;

import comp640.computerbuilder.model.build.Build;

/**
 * Created by alexanderturner on 4/11/16.
 */
public abstract class OnGetBuildCompleteListener {
    /**
     * Called when the build is received.
     */
    public abstract void onBuildReceived(Build build);

    /**
     * Called when the call is cancelled.
     */
    public abstract void onCancelled(String error);
}
