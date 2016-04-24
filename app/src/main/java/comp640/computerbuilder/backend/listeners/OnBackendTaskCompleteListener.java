package comp640.computerbuilder.backend.listeners;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the possibilities of a backend call.
 */
public abstract class OnBackendTaskCompleteListener {
    /**
     * Called on success.
     */
    public abstract void onSuccess();

    /**
     * Called on failure.
     */
    public abstract void onFailure(String reason);
}
