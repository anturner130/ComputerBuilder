package comp640.computerbuilder.backend.firebase;

import com.firebase.client.Firebase;

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
     * The singleton instance.
     */
    private static FirebaseReference _singleton;

    /**
     * Constructor to initialize the reference.
     */
    private FirebaseReference(){
        _reference = new Firebase(APP_URL);
    }

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
}
