package comp640.computerbuilder.backend;

import comp640.computerbuilder.backend.interfaces.IUser;

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
     * The user backend.
     */
    private IUser _user;

    /**
     * Private constructor for singleton.
     */
    private DataController(){
        _user = new FirebaseUser();
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
}
