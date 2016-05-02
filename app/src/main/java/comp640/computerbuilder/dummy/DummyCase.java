package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyCase implements IDummyParts {
    private List<Part> _case;

    public DummyCase()
    {
        _case = new ArrayList<>();

        _case.add(new Part(456, "Blue Case", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Case,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));

    }

    public List<Part> getParts() {return _case;}
}
