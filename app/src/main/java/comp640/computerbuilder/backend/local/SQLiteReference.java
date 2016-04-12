package comp640.computerbuilder.backend.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

import com.firebase.client.Firebase;

import comp640.computerbuilder.backend.remote.FirebaseReference;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the reference to the FirebaseDB
 */
public class SQLiteReference {

    /**
     * This db name.
     */
    private static final String DB_NAME = "computer_builder";

    /**
     * The reference to the DB
     */
    private SQLiteDatabase _reference;

    /**
     * The singleton instance.
     */
    private static SQLiteReference _singleton;

    /**
     * Constructor to initialize the reference.
     */
    private SQLiteReference(){
        _reference = SQLiteDatabase.openOrCreateDatabase(DB_NAME, new SQLiteDatabase.CursorFactory() {
            @Override
            public Cursor newCursor(SQLiteDatabase sqLiteDatabase, SQLiteCursorDriver sqLiteCursorDriver, String s, SQLiteQuery sqLiteQuery) {
                return null;
            }
        });
    }

    /**
     * Gets the singleton instance.
     * @return the instance
     */
    public static SQLiteReference getSingleton(){
        if(_singleton == null)
            _singleton = new SQLiteReference();
        return _singleton;
    }

    /**
     * Gets the SQLiteDatabase Reference
     * @return the reference.
     */
    public SQLiteDatabase getReference() {
        return _reference;
    }
}
