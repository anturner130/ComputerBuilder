package comp640.computerbuilder.model.build;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.model.parts.Part;

/**
 * Created by alexanderturner on 4/11/16.
 * Represents a build
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Build {
    /**
     * The build name.
     */
    private String name;

    /**
     * The budget range.
     */
    private int budgetMin;
    private int budgetMax;

    /**
     * The build style.
     */
    private BuildStyle style;

    /**
     * The list of stores the the build supports.
     */
    private List<BuildStore> stores;

    /**
     * The list of parts.
     */
    private List<Part> parts;

    /**
     * The list of images.
     */
    private String imageURL;

    /**
     * The total price;
     */
    private int price;

    private Build(){}

    /**
     * Constructor to initialize local variables
     * @param name the name of the build.
     * @param budgetMin the minimum budget.
     * @param budgetMax the maximum budget.
     * @param style the build style.
     * @param stores the stores accepted.
     */
    @JsonIgnore
    public Build(String name,
                 int budgetMin,
                 int budgetMax,
                 BuildStyle style,
                 List<BuildStore> stores){
        this.name = name;
        this.budgetMin = budgetMin;
        this.budgetMax = budgetMax;
        this.style = style;
        this.stores = stores;
        this.parts = new ArrayList<>();
        this.imageURL = "";
        this.price = 0;

        updateDB();
    }

    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public int getBudgetMin() {
        return budgetMin;
    }

    public int getBudgetMax() {
        return budgetMax;
    }

    public BuildStyle getStyle() {
        return style;
    }

    public List<BuildStore> getStores() {
        return stores;
    }

    public List<Part> getParts(){ return parts;}


    public String getImageURL(){return imageURL;}


    public int getPrice(){return price;}

    /**
     * Setters
     */

    @JsonIgnore
    public void setImageURL(String url){
        imageURL = url;
        updateDB();
    }

    @JsonIgnore
    public void setPrice(int price){
        this.price = price;
        updateDB();
    }


    @JsonIgnore
    private void updateDB(){
        DataController.getController().getBuild().updateBuild(this,null);
    }

    /*
    @Override
    public String toString() {
        return "Build{name='" + name + "\', budgetMin='" + budgetMin + "\', budgetMax='" + budgetMax
                + "\', style='" + style + "\', parts='" + parts + "\', imageURL='" + imageURL +
                "\', price='" + price + "'}";
    }
    */
}
