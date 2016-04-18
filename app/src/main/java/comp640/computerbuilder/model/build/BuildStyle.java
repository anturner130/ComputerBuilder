package comp640.computerbuilder.model.build;

import android.preference.Preference;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the different build styles.
 */
public enum BuildStyle {
    No_Preference,
    Gaming,
    Social,
    Business,
    School;

    @Override
    public String toString() {
        return super.toString().replace("_"," ");
    }
}
