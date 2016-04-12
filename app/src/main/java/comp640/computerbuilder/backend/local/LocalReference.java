package comp640.computerbuilder.backend.local;

import android.app.Application;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.preference.PreferenceManager;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the reference to the FirebaseDB
 */
public class LocalReference extends Application{
    /**
     * The reference to the DB
     */
    private SharedPreferences _reference;

    /**
     * The singleton instance.
     */
    private static LocalReference _singleton;

    /**
     * Constructor to initialize the reference.
     */
    private LocalReference(){
        _reference = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    }

    /**
     * Gets the singleton instance.
     * @return the instance
     */
    public static LocalReference getSingleton(){
        if(_singleton == null)
            _singleton = new LocalReference();
        return _singleton;
    }

    /**
     * Gets the SQLiteDatabase Reference
     * @return the reference.
     */
    public SharedPreferences getReference() {
        return _reference;
    }
}
