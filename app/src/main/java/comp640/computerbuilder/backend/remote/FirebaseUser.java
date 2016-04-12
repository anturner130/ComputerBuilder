package comp640.computerbuilder.backend.remote;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.Map;

import comp640.computerbuilder.backend.interfaces.IUser;
import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;
import comp640.computerbuilder.backend.remote.FirebaseReference;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the user methods to access the remote db
 */
public class FirebaseUser implements IUser{

    /**
     * The reference to the DB.
     */
    private Firebase _reference;

    /**
     * Constructor to initialize the local variables
     */
    public FirebaseUser(){
        _reference = FirebaseReference.getSingleton().getReference();
    }

    /**
     * Attempts logging in.
     * @param email the email.
     * @param password the password.
     * @param listener the listener for when the task is complete.
     */
    @Override
    public void login(String email, String password, final OnBackendTaskCompleteListener listener) {
        _reference.authWithPassword(email, password, new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                listener.onSuccess();
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                listener.onFailure(firebaseError.getMessage());
            }
        });
    }

    /**
     * Attempts registering the user.
     * @param email the email.
     * @param password the password.
     * @param listener the listener for when the task is complete.
     */
    @Override
    public void register(String email, String password, final OnBackendTaskCompleteListener listener) {
        _reference.createUser(email, password, new Firebase.ValueResultHandler<Map<String, Object>>() {
            @Override
            public void onSuccess(Map<String, Object> result) {
                listener.onSuccess();
            }

            @Override
            public void onError(FirebaseError firebaseError) {
               listener.onFailure(firebaseError.getMessage());
            }
        });
    }

    /**
     * Logs the current user out.
     */
    @Override
    public void logOut() {
        _reference.unauth();
    }

}
