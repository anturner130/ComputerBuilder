package comp640.computerbuilder.model.build;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents the stores that the build can have parts from.
 */
public enum BuildStore {
    Multiple_Stores,
    Amazon,
    Newegg;

    @Override
    public String toString() {
        return super.toString().replace("_"," ");
    }

}
