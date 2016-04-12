package comp640.computerbuilder.backend;

import comp640.computerbuilder.backend.interfaces.IBuild;
import comp640.computerbuilder.backend.interfaces.IUser;
import comp640.computerbuilder.backend.local.SQLiteBuild;
import comp640.computerbuilder.backend.remote.FirebaseBuild;
import comp640.computerbuilder.backend.remote.FirebaseUser;

/**
 * Created by alexanderturner on 4/11/16.
 * Provides access to the backend
 */
public class DataController {

    /**
     * The singleton instance.
     */
    private static DataController _dataController;

    /**
     * The remote user backend.
     */
    private IUser _remoteUser;

    /**
     * The remote build backend;
     */
    private IBuild _remoteBuild;

    /**
     * The remote build backend;
     */
    private IBuild _localBuild;

    /**
     * The boolean that controls whether or we're accessing the remot db
     */
    private boolean _remote;

    /**
     * Private constructor for singleton.
     */
    private DataController(){
        _remoteUser = new FirebaseUser();
        _remoteBuild = new FirebaseBuild();

        _localBuild = new SQLiteBuild();
    }

    /**
     * Singleton get method.
     * @return the singleton datacontroller.
     */
    public static DataController getController(boolean remote){
        if(_dataController == null)
            _dataController = new DataController();
        return _dataController;
    }

    /**
     * Gets the user backend
     * @return the user backend.
     */
    public IUser getUser(){
        return _remoteUser;
    }

    /**
     * Gets the build backend
     * @return the build backend.
     */
    public IBuild getBuild(){
        if(_remote)
            return _remoteBuild;
        else
            return _localBuild;
    }
}
