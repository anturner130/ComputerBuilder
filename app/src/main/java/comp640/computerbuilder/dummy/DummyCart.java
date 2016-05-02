package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import comp640.computerbuilder.model.parts.Part;

/**
 * Created by deandubois on 5/1/16.
 * Used by the cart to store its data
 * Used a singleton to allow it to be accessed from any class
 */
public class DummyCart implements IDummyParts {

    private List<Part> cart;
    private static DummyCart _singleton;
    private DummyCart()
    {
        cart = new ArrayList<>();
    }

    public static DummyCart getSingleton(){
        if(_singleton == null)
            _singleton = new DummyCart();
        return _singleton;
    }

    public void add(Part part)
    {
        getSingleton().getParts().add(part);
    }

    public void add(Map<String, Part> parts)
    {
        for (Part p: parts.values())
            getSingleton().getParts().add(p);
    }

    public void remove(int location)
    {
        getSingleton().getParts().remove(location);
    }


    public List<Part> getParts() {return cart;}
}
