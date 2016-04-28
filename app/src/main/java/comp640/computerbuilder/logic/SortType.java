package comp640.computerbuilder.logic;

/**
 * Created by alexanderturner on 4/27/16.
 */
public enum  SortType {
    No_Sort,
    Highest_to_Lowest_Price,
    Lowest_to_Highest_Price,;

    public String toString() {
        return super.toString().replace("_"," ");
    }

}
