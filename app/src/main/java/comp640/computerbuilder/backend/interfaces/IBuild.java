package comp640.computerbuilder.backend.interfaces;

import android.content.Context;

import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;
import comp640.computerbuilder.backend.listeners.OnGetBuildCompleteListener;
import comp640.computerbuilder.model.build.Build;

/**
 * Created by alexanderturner on 4/11/16.
 * Methods for the backend to implement for build information
 */
public interface IBuild {
    /**
     * Updates or adds a build.
     */
    void updateBuild(Build build, OnBackendTaskCompleteListener listener);

    /**
     * Gets the saved builds.
     */
    void registerOnGetBuildCompleteListener(OnGetBuildCompleteListener listener);
}
