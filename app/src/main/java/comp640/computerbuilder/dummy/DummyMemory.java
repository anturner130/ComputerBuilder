package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyMemory implements IDummyParts {
    private List<Part> memory;

    public DummyMemory()
    {
        memory = new ArrayList<>();

        memory.add(new Part(456, "12 Gb RAM", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Memory,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));

    }

    public List<Part> getParts() {return memory;}
}
