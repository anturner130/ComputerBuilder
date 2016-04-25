package comp640.computerbuilder.logic;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.backend.listeners.OnGetSettingCompleteListener;

/**
 * Created by alexanderturner on 4/20/16.
 *
 */
public class SettingsReference {

    /**
     * The singleton reference
     */
    private static SettingsReference _reference;

    /**
     * Settings data;
     */
    private boolean _displayTips;
    private boolean _displayWarnings;

    private SettingsReference(){}

    public void init(){
        _displayTips = true;
        _displayWarnings = true;

        DataController.getController().getSettings()
                .getDisplayTips(new OnGetSettingCompleteListener() {
                    @Override
                    public void onSettingReceived(boolean set) {
                        _displayTips = set;
                    }
                });

        DataController.getController().getSettings()
                .getDisplayWarnings(new OnGetSettingCompleteListener() {
                    @Override
                    public void onSettingReceived(boolean set) {
                        _displayWarnings = set;
                    }
                });
    }

    /**
     * Gets the singleton reference
     * @return the reference
     */
    public static SettingsReference getReference(){
        if(_reference == null)
            _reference = new SettingsReference();
        return _reference;
    }

    /**
     * Gets display tips
     * @return whether to display tips or not
     */
    public boolean getDisplayTips(){
        return _displayTips;
    }

    /**
     * Gets display warnings
     * @return whether to display warnings or not
     */
    public boolean getDisplayWarnings(){
        return _displayWarnings;
    }

    /**
     * Sets display tips
     * @param displayTips
     */
    public void setDisplayTips(boolean displayTips){
        DataController.getController().getSettings().setDisplayTips(displayTips);
    }

    /**
     * Sets display warnings
     * @param displayWarnings
     */
    public void setDisplayWarnings(boolean displayWarnings){
        DataController.getController().getSettings().setDisplayWarnings(displayWarnings);
    }
}
