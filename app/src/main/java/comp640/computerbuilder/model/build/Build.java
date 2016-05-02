package comp640.computerbuilder.model.build;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

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
    private Map<String,Part> parts;

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
        this.parts = new HashMap<>();
        this.imageURL = "";
        this.price = 0;

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

    public Map<String,Part> getParts(){ return parts;}


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
    private void updateDB(){
        DataController.getController().getBuild().updateBuild(this, null);
    }

    @JsonIgnore
    public Part getPart(PartType type){
        if(parts == null)
            parts = new HashMap<>();
        return parts.get(type.toString());
    }

    @JsonIgnore
    public List<Part> getPartsList(){
        if(parts == null)
            parts = new HashMap<>();
        return new ArrayList<>(parts.values());
    }

    @JsonIgnore
    public void setPart(Part part){
        if(parts == null)
            parts = new HashMap<>();
        parts.put(part.getType().toString(), part);
        setPriceFromParts();
        updateDB();
    }

    /**
     * Sets the price based on the parts
     */
    @JsonIgnore
    private void setPriceFromParts(){
        price = 0;
        for (int i = 0; i < parts.keySet().size(); i++){
            price += parts.get(parts.keySet().toArray()[i]).getPrice();
        }
    }
}
