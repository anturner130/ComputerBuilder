package comp640.computerbuilder.backend;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import comp640.computerbuilder.backend.firebase.FirebaseReference;
import comp640.computerbuilder.backend.firebase.FirebaseSettings;
import comp640.computerbuilder.backend.interfaces.IBuild;
import comp640.computerbuilder.backend.interfaces.ISettings;
import comp640.computerbuilder.backend.interfaces.IUser;
import comp640.computerbuilder.backend.firebase.FirebaseBuild;
import comp640.computerbuilder.backend.firebase.FirebaseUser;

/**
 * Created by alexanderturner on 4/11/16.
 * Provides access to the backend
 */
public class DataController {

    /**
     * The android context;
     */
    private static Context _context;

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
     * The remote build backend;
     */
    private ISettings _settings;


    /**
     * Private constructor for singleton.
     */
    private DataController(){
        _user = new FirebaseUser();
        _build = new FirebaseBuild();
        _settings = new FirebaseSettings();
    }

    /**
     * Singleton get method.
     * @return the singleton datacontroller.
     */
    public static DataController getController(){
        if(_dataController == null)
            _dataController = new DataController();
        checkNetworkStatus();
        return _dataController;
    }

    /**
     * Initializes the data controller with the android context;
     * @param context the context
     */
    public void Initialize(Context context){
        _context = context;
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

    /**
     * Gets the settings backend
     * @return the settings backend.
     */
    public ISettings getSettings(){
        return _settings;
    }

    /**
     * Checks the network status
     */
    private static void checkNetworkStatus(){
        if(_context!= null && !isNetworkAvailable())
            Toast.makeText(_context,"Please connect to wifi to use the application",
                    Toast.LENGTH_LONG).show();
    }

    /**
     * Checks to see if the network is available;
     * @return the network status
     */
    public static boolean isNetworkAvailable() {
        if(_context != null){
            ConnectivityManager connectivityManager
                    = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }
}
