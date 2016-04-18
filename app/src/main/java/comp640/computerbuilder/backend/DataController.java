package comp640.computerbuilder.backend;

import comp640.computerbuilder.backend.interfaces.IBuild;
import comp640.computerbuilder.backend.interfaces.IUser;
import comp640.computerbuilder.backend.firebase.FirebaseBuild;
import comp640.computerbuilder.backend.firebase.FirebaseUser;

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
    private IUser _user;

    /**
     * The remote build backend;
     */
    private IBuild _build;


    /**
     * Private constructor for singleton.
     */
    private DataController(){
        _user = new FirebaseUser();
        _build = new FirebaseBuild();
    }

    /**
     * Singleton get method.
     * @return the singleton datacontroller.
     */
    public static DataController getController(){
        if(_dataController == null)
            _dataController = new DataController();
        return _dataController;
    }

    /**
     * Gets the user backend
     * @return the user backend.
     */
    public IUser getUser(){
        return _user;
    }

    /**
     * Gets the build backend
     * @return the build backend.
     */
    public IBuild getBuild(){
        return _build;
    }
}
