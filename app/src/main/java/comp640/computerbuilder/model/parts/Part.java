package comp640.computerbuilder.model.parts;

import android.graphics.Bitmap;

import comp640.computerbuilder.model.build.BuildStore;

/**
 * Created by alexanderturner on 4/11/16.
 * Class to represent a part.
 */
public class Part {

    private int _price;
    private String _name;
    private BuildStore _store;
    private String _description;
    private String _brand;
    private PartType _type;
    private String _url;
    private Bitmap _image;

    public Part(int price, String name, BuildStore store, String description,
                String brand, PartType type, String url){
        setPrice(price);
        setName(name);
        setStore(store);
        setDescription(description);
        setBrand(brand);
        setType(type);
        setUrl(url);
        _image = null;
    }


    public int getPrice() {
        return _price;
    }

    public void setPrice(int _price) {
        this._price = _price;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public BuildStore getStore() {
        return _store;
    }

    public void setStore(BuildStore _store) {
        this._store = _store;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String _brand) {
        this._brand = _brand;
    }


    public PartType getType() {
        return _type;
    }

    public void setType(PartType _type) {
        this._type = _type;
    }

    public void setUrl(String _url) {this._url = _url;}

    public String getUrl() {return _url;}

    public void setImage(Bitmap _image) {this._image = _image;}

    public Bitmap getImage() {return _image;}


}
