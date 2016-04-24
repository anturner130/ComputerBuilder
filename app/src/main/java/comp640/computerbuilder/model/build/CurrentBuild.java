package comp640.computerbuilder.model.build;

/**
 * Created by alexanderturner on 4/17/16.
 * Represents the current build the user is working on.
 */
public class CurrentBuild {
    /**
     * Holds the current build.
     */
    private Build _currentBuild;

    /**
     * Holds the singleton instance.
     */
    private static CurrentBuild _singleton;

    /**
     * Private constructor for singleton.
     */
    private CurrentBuild(){}

    /**
     * Gets the singleton instance.
     * @return the singleton.
     */
    public static CurrentBuild getSingleton(){
        if(_singleton == null)
            _singleton = new CurrentBuild();
        return _singleton;
    }

    /**
     * Sets the current build.
     * @param build a build.
     */
    public void setCurrentBuild(Build build){
        _currentBuild = build;
    }

    /**
     * Gets the current build.
     * @return the current build.
     */
    public Build getCurrentBuild(){
        return _currentBuild;
    }
}
