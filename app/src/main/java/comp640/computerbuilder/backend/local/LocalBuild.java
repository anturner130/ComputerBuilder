package comp640.computerbuilder.backend.local;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.ArraySet;

import com.firebase.client.Firebase;

import java.util.HashSet;
import java.util.Set;

import comp640.computerbuilder.backend.interfaces.IBuild;
import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;
import comp640.computerbuilder.backend.listeners.OnGetBuildCompleteListener;
import comp640.computerbuilder.backend.remote.FirebaseReference;
import comp640.computerbuilder.model.Build;

/**
 * Created by alexanderturner on 4/11/16.
 */
public class LocalBuild  implements IBuild{
    /**
     * The builds tag.
     */
    private static final String BUILDS_TAG = "builds";

    /**
     * The reference to the DB.
     */
    private SharedPreferences _reference;

    /**
     * A list of all builds,
     */
    private Set<String> _builds;

    /**
     * Constructor to initialize the local variables
     */
    public LocalBuild(){
        _reference = LocalReference.getSingleton().getReference();
        _builds = _reference.getStringSet(BUILDS_TAG, null);
        if(_builds == null)
            _builds = new HashSet<>();
    }

    /**
     * Updates the local build
     * @param build the build
     * @param listener the listener
     */
    @Override
    public void updateBuild(Build build, OnBackendTaskCompleteListener listener) {

        if (!_builds.contains(build.getName()))
            _builds.add(build.getName());

        SharedPreferences.Editor editor = _reference.edit();
        editor.putStringSet(BUILDS_TAG, _builds);
        updateBuild(build, editor);
        editor.apply();
    }

    /**
     * Registers the OnGetBuildCompleteListener.
     */
    @Override
    public void registerOnGetBuildCompleteListener(OnGetBuildCompleteListener listener) {
        _builds = _reference.getStringSet(BUILDS_TAG, null);
        if(_builds == null)
            return;

        for (String build: _builds) {
            listener.onBuildReceived(getBuild(build));
        }
    }

    /**
     * Updates the build
     * @param build the build
     * @param editor the editor
     */
    private void updateBuild(Build build, SharedPreferences.Editor editor){

    }

    private Build getBuild(String name){
        return null;
    }

}
