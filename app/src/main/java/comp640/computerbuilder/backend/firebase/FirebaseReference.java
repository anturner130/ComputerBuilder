package comp640.computerbuilder.backend.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.firebase.client.Firebase;

import java.util.UUID;

import comp640.computerbuilder.backend.DataController;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the reference to the FirebaseDB
 */
public class FirebaseReference{

    /**
     * This application app url.
     */
    private static final String APP_URL = "https://computerbuilder.firebaseio.com/";

    /**
     * The reference to the DB
     */
    private Firebase _reference;

    /**
     * The uuid tag.
     */
    private static final String UUID_TAG = "uuid";

    /**
     * The shared preferences.
     */
    private String ID;

    /**
     * The singleton instance.
     */
    private static FirebaseReference _singleton;

    /**
     * Constructor to initialize the reference.
     */
    private FirebaseReference(){}

    /**
     * Gets the singleton instance.
     * @return the instance
     */
    public static FirebaseReference getSingleton(){
        if(_singleton == null)
            _singleton = new FirebaseReference();
        return _singleton;
    }

    /**
     * Gets the Firebase Reference
     * @return the reference.
     */
    public Firebase getReference() {
        return _reference;
    }

    /**
     * Initialize the class with the android context
     * @param context the android context
     */
    public void Initialize(Context context){
        Firebase.setAndroidContext(context);
        _reference = new Firebase(APP_URL);

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        if(preferences.contains(UUID_TAG))
            ID = preferences.getString(UUID_TAG,"local");
        else{
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(UUID_TAG, uuid);
            editor.apply();
            ID = uuid;
        }
    }


    /**
     * Gets the name of the child branch
     * @return the child name
     */
    public String getChildName(){
        if(DataController.getController().getUser().isLoggedIn())
            return DataController.getController().getUser().getEmail();

        return ID;
    }
}
