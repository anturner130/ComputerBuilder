package comp640.computerbuilder.backend.firebase;

import com.firebase.client.Firebase;

/**
 * Created by alexanderturner on 4/20/16.
 * Base class for all firebase communication
 */
public class FirebaseBase {

    /**
     * The reference to the DB.
     */
    protected Firebase _reference;

    /**
     * Constructor to initialize the local variables
     */
    protected FirebaseBase(){
        _reference = FirebaseReference.getSingleton().getReference();
    }

    /**
     * Gets the child name.
     * @return the child name.
     */
    protected String getChildName(){
        return FirebaseReference.getSingleton().getChildName();
    }
}
