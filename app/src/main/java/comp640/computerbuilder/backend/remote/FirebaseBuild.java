package comp640.computerbuilder.backend.remote;

import com.firebase.client.Firebase;

import comp640.computerbuilder.backend.interfaces.IBuild;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the build methods to access the remote db
 */
public class FirebaseBuild implements IBuild {
    /**
     * The reference to the DB.
     */
    private Firebase _reference;

    /**
     * Constructor to initialize the local variables
     */
    public FirebaseBuild(){
        _reference = FirebaseReference.getSingleton().getReference();
    }
}
