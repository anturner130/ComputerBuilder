package comp640.computerbuilder.model.parts;

import android.graphics.Bitmap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import comp640.computerbuilder.model.build.BuildStore;

/**
 * Created by alexanderturner on 4/11/16.
 * Class to represent a part.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Part {

    private int price;
    private String name;
    private BuildStore store;
    private String description;
    private String brand;
    private PartType type;
    private String url;
    @JsonIgnore
    private Bitmap image;

    private Part(){}

    @JsonIgnore
    public Part(int price, String name, BuildStore store, String description,
                String brand, PartType type, String url){
        setPrice(price);
        setName(name);
        setStore(store);
        setDescription(description);
        setBrand(brand);
        setType(type);
        setUrl(url);
        image = null;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int _price) {
        this.price = _price;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public BuildStore getStore() {
        return store;
    }

    public void setStore(BuildStore _store) {
        this.store = _store;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String _description) {
        this.description = _description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String _brand) {
        this.brand = _brand;
    }

    public PartType getType() {
        return type;
    }

    public void setType(PartType _type) {
        this.type = _type;
    }

    public void setUrl(String _url) {this.url = _url;}

    public String getUrl() {return url;}

    @JsonIgnore
    public void setImage(Bitmap _image) {this.image = _image;}

    @JsonIgnore
    public Bitmap getImage() {return image;}


}
