package comp640.computerbuilder.backend.remote;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.backend.interfaces.IBuild;
import comp640.computerbuilder.backend.listeners.OnBackendTaskCompleteListener;
import comp640.computerbuilder.backend.listeners.OnGetBuildCompleteListener;
import comp640.computerbuilder.model.Build;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the build methods to access the remote db
 */
public class FirebaseBuild implements IBuild {

    /**
     * The builds tag.
     */
    private static final String BUILDS_TAG = "builds";
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

    /**
     * Updates or adds a build.
     * @param build the build to update.
     * @param listener the completion listener.
     */
    @Override
    public void updateBuild(Build build, final OnBackendTaskCompleteListener listener) {
        _reference.child(DataController.getController().getUser().getEmail())
                .child(BUILDS_TAG)
                .child(build.getName())
                .setValue(build, new Firebase.CompletionListener() {
                    @Override
                    public void onComplete(FirebaseError firebaseError, Firebase firebase) {
                        if(firebase == null)
                            listener.onSuccess();
                        else listener.onFailure(firebaseError.getMessage());
                    }
                });
    }

    /**
     * Gets the saved builds.
     * @param listener the completion listener.
     * @return the list of builds
     */
    @Override
    public void registerOnGetBuildCompleteListener(final OnGetBuildCompleteListener listener) {
        Query query = _reference.child(DataController.getController().getUser().getEmail())
                .child(BUILDS_TAG)
                .orderByKey();
        query.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                listener.onBuildReceived(dataSnapshot.getValue(Build.class));
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                listener.onBuildReceived(dataSnapshot.getValue(Build.class));
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                listener.onCancelled(firebaseError.getMessage());
            }
        });
    }
}
