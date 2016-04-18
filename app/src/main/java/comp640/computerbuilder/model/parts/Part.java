package comp640.computerbuilder.model.parts;

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

    public Part(int price, String name, BuildStore store, String description,
                String brand, PartType type){
        setPrice(price);
        setName(name);
        setStore(store);
        setDescription(description);
        setBrand(brand);
        setType(type);
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
}
