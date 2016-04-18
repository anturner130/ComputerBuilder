package comp640.computerbuilder.model.build;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.model.parts.Part;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents a build
 */
public class Build {
    /**
     * The build name.
     */
    private String _name;

    /**
     * The budget range.
     */
    private int _budgetMin;
    private int _budgetMax;

    /**
     * The build style.
     */
    private BuildStyle _style;

    /**
     * The list of stores the the build supports.
     */
    private List<BuildStore> _stores;

    /**
     * The list of parts.
     */
    private List<Part> _parts;

    /**
     * The list of images.
     */
    private String _imageURL;

    /**
     * The total price;
     */
    private int _price;

    /**
     * Constructor to initialize local variables
     * @param name the name of the build.
     * @param budgetMin the minimum budget.
     * @param budgetMax the maximum budget.
     * @param style the build style.
     * @param stores the stores accepted.
     */
    public Build(String name,
                 int budgetMin,
                 int budgetMax,
                 BuildStyle style,
                 List<BuildStore> stores){
        _name = name;
        _budgetMin = budgetMin;
        _budgetMax = budgetMax;
        _style = style;
        _stores = stores;
        _parts = new ArrayList<>();

        updateDB();
    }

    /**
     * Getters
     */
    public String getName() {
        return _name;
    }

    public int getBudgetMin() {
        return _budgetMin;
    }

    public int getBudgetMax() {
        return _budgetMax;
    }

    public BuildStyle getStyle() {
        return _style;
    }

    public List<BuildStore> getStores() {
        return _stores;
    }

    public List<Part> getParts(){ return _parts;}

    public String getImageURL(){return _imageURL;}

    public int getPrice(){return _price;}

    /**
     * Setters
     */

    public void setImageURL(String url){
        _imageURL = url;
        updateDB();
    }

    public void setPrice(int price){
        _price = price;
        updateDB();
    }


    private void updateDB(){
        DataController.getController().getBuild().updateBuild(this,null);
    }
}
