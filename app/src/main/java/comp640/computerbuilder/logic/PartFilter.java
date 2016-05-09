package comp640.computerbuilder.logic;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;

/**
 * Created by alexanderturner on 4/27/16.
 */
public class PartFilter {

    /**
     * Filter properties
     */
    private int minPrice;
    private int maxPrice;
    private String brand;
    private BuildStore store;
    private SortType sortType;

    /**
     * The filter instance
     */
    private static PartFilter _filter;

    /**
     * Private constructor for filter data.
     */
    private PartFilter(){sortType = SortType.No_Sort;}

    /**
     * Gets the singleton
     * @return the filter
     */
    public static PartFilter getFilter(){
        if(_filter == null)
            _filter = new PartFilter();
        return _filter;
    }

    /**
     * Resets the variables to the default values
     */
    public void resetDefaultValues(){
        minPrice = -1;
        maxPrice = -1;
        brand = null;
        sortType = SortType.No_Sort;
        store = BuildStore.Multiple_Stores;
    }

    /**
     * Setters
     */
    public void setMinPrice(int price){
        minPrice = price;
    };
    public void setMaxPrice(int price){
        maxPrice = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setStore(BuildStore store) {this.store = store;}
    public void setSortType(SortType type)
    {
        sortType = type;
    }

    /**
     * Getters
     */
    public int getMinPrice(){
        return minPrice;
    };
    public int getMaxPrice(){
        return maxPrice;
    }
    public String getBrand(){
        return brand;
    }
    public BuildStore getStore() {return store;}
    public SortType getSortType()
    {
        return sortType;
    }

    /**
     * Filters the part list
     * @param partsToFilter the parts to filter
     * @return the filtered parts
     */
    public List<Part> filterParts(List<Part> partsToFilter, Context context){

        List<Part> newPartList = new ArrayList<>();
        if(maxPrice != -1){
            for (Part part:partsToFilter) {
                if(part.getPrice() <= maxPrice && part.getPrice() >= minPrice)
                    newPartList.add(part);
            }
        }

        if(brand != null && !brand.equals("None")){
            if(newPartList.isEmpty()){
                for (Part part:partsToFilter) {
                    if(part.getBrand().equals(brand))
                        newPartList.add(part);
                }
            } else {
                List<Part> partsToRemove = new ArrayList<>();
                for (Part part:newPartList) {
                    if(!part.getBrand().equals(brand))
                        partsToRemove.add(part);
                }
                for (Part part:partsToRemove) {
                        newPartList.remove(part);
                }
            }

        }

        if (sortType != SortType.No_Sort){
            switch (sortType){
                case Highest_to_Lowest_Price:
                    if(newPartList.isEmpty()){
                        Collections.sort(partsToFilter, new Comparator<Part>() {
                            @Override
                            public int compare(Part p1, Part p2) {
                                return p2.getPrice() - p1.getPrice();
                            }
                        });
                    }else {
                        Collections.sort(newPartList, new Comparator<Part>() {
                            @Override
                            public int compare(Part p1, Part p2) {
                                return p2.getPrice() - p1.getPrice();
                            }
                        });
                    }
                    break;
                case Lowest_to_Highest_Price:
                    if(newPartList.isEmpty()){
                        Collections.sort(partsToFilter, new Comparator<Part>() {
                            @Override
                            public int compare(Part p1, Part p2) {
                                return p1.getPrice() - p2.getPrice();
                            }
                        });
                    }else {
                        Collections.sort(newPartList, new Comparator<Part>() {
                            @Override
                            public int compare(Part p1, Part p2) {
                                return p1.getPrice() - p2.getPrice();
                            }
                        });
                    }
                    break;
            }
        }

        if (store != BuildStore.Multiple_Stores){
            if(newPartList.isEmpty()){
                for (Part part:partsToFilter) {
                    if(part.getStore().equals(store))
                        newPartList.add(part);
                }
            } else {
                List<Part> partsToRemove = new ArrayList<>();
                for (Part part:newPartList) {
                    if(!part.getStore().equals(store))
                        partsToRemove.add(part);
                }
                for (Part part:partsToRemove) {
                    newPartList.remove(part);
                }
            }
        }

        if(newPartList.isEmpty()) {
            //Toast.makeText(context,"Zero Filter Results", Toast.LENGTH_LONG).show();
            return partsToFilter;
        }

        return newPartList;
    }
}
