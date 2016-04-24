package comp640.computerbuilder.backend.firebase;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import comp640.computerbuilder.backend.interfaces.ISettings;
import comp640.computerbuilder.backend.listeners.OnGetSettingCompleteListener;

/**
 * Created by alexanderturner on 4/20/16.
 */
public class FirebaseSettings extends FirebaseBase implements ISettings {

    /**
     * Constants
     */
    private static final String TIPS_TAG = "tips";
    private static final String WARNINGS_TAG = "warnings";

    @Override
    public void setDisplayTips(boolean set) {
        _reference.child(getChildName())
                .child(TIPS_TAG)
                .setValue(set);
    }

    @Override
    public void setDisplayWarnings(boolean set) {
        _reference.child(getChildName())
                .child(WARNINGS_TAG)
                .setValue(set);
    }

    @Override
    public void getDisplayTips(final OnGetSettingCompleteListener listener) {
        Query query = _reference.child(getChildName())
                .child(TIPS_TAG);

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listener.onSettingReceived((boolean)dataSnapshot.getValue());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

    @Override
    public void getDisplayWarnings(final OnGetSettingCompleteListener listener) {
        Query query = _reference.child(getChildName())
                .child(WARNINGS_TAG);

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listener.onSettingReceived((boolean)dataSnapshot.getValue());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
