package comp640.computerbuilder.backend.firebase;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.Map;

import comp640.computerbuilder.backend.interfaces.IUser;
import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the user methods to access the remote db
 */
public class FirebaseUser extends FirebaseBase implements IUser{
    /**
     * The email of the current user;
     */
    private String _email;

    /**
     * Attempts logging in.
     * @param email the email.
     * @param password the password.
     * @param listener the listener for when the task is complete.
     */
    @Override
    public void login(final String email, String password, final OnBackendTaskCompleteListener listener) {
        _reference.authWithPassword(email, password, new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                _email = email;
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
        _email = null;
    }

    /**
     * Checks to see if the current user is logged in.
     * @return true if logged in, otherwise false.
     */
    @Override
    public boolean isLoggedIn() {
        return _reference.getAuth() != null;
    }

    /**
     * Gets the email of the current user.
     * @return the email
     */
    @Override
    public String getEmail() {
        return _email;
    }

}
