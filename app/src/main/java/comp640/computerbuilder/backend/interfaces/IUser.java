package comp640.computerbuilder.backend.interfaces;

import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;

/**
 * Created by alexanderturner on 4/11/16.
 * Methods for the backend to implement for user information
 */
public interface IUser {
    /**
     * Attempt to log the user in.
     */
    void login(String email, String password, OnBackendTaskCompleteListener listener);

    /**
     * Attempt to register the user.
     */
    void register(String email, String password, OnBackendTaskCompleteListener listener);

    /**
     * Logs the user out.
     */
    void logOut();

    /**
     * Checks to see if the user is logged in.
     * @return true if logged in, otherwise false.
     */
    boolean isLoggedIn();

    /**
     * Gets the email of the current user.
     * @return the email
     */
    String getEmail();
}
