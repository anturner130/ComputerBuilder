package comp640.computerbuilder.model.build;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.backend.listeners.OnGetBuildCompleteListener;

/**
 * Created by alexanderturner on 4/11/16.
 */
public class SavedBuilds {
    /**
     * Holds the builds
     */
    private List<Build> _builds;

    private List<OnBuildsChangedListener> _listeners;

    /**
     * The singleton instance.
     */
    private static SavedBuilds _singleton;

    /**
     * Private constructor for singleton
     */
    private SavedBuilds(){
        _builds = new ArrayList<>();
        _listeners = new ArrayList<>();

        DataController.getController().getBuild().registerOnGetBuildCompleteListener(new OnGetBuildCompleteListener() {
            @Override
            public void onBuildReceived(Build build) {
                int i = 0;
                for (Build temp: _builds) {
                    if(temp.getName().equals(build.getName())) {
                        _builds.set(i, build);
                        return;
                    }
                    i++;
                }
                _builds.add(build);

                for (OnBuildsChangedListener listener: _listeners)
                    listener.onBuildsChanged();


            }

            @Override
            public void onCancelled(String error) {

            }
        });
    }

    /**
     * Gets the singleton instance.
     * @return the singleton
     */
    public static SavedBuilds getSingleton(){
        if(_singleton == null)
            _singleton = new SavedBuilds();
        return _singleton;
    }

    /**
     * Registers the listener
     * @param listener the on build changed listener
     */
    public void registerOnBuildsChangedListener(OnBuildsChangedListener listener){
        if(!_listeners.contains(listener))
            _listeners.add(listener);
    }

    /**
     * Unregisters the listener
     * @param listener the on builds changed listener
     */
    public void unregisterOnBuildsChangedListener(OnBuildsChangedListener listener){
        if(_listeners.contains(listener))
            _listeners.remove(listener);
    }

    /**
     * Gets the saved builds of the current user;
     * @return
     */
    public List<Build> getBuilds(){
        return _builds;
    }
}
