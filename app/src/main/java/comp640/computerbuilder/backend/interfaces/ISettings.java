package comp640.computerbuilder.backend.interfaces;

import comp640.computerbuilder.backend.listeners.OnGetSettingCompleteListener;

/**
 * Created by alexanderturner on 4/20/16.
 * Methods for the backend to implement for settings information
 */
public interface ISettings {
    /**
     * Sets display tips
     * @param set enable
     */
    void setDisplayTips(boolean set);

    /**
     * Sets display warnings
     * @param set enable
     */
    void setDisplayWarnings(boolean set);

    /**
     * Gets display tips
     * @return if displaying tips
     */
    void getDisplayTips(OnGetSettingCompleteListener listener);

    /**
     * Gets display warnings
     * @return if displaying warnings
     */
    void getDisplayWarnings(OnGetSettingCompleteListener listener);
}
