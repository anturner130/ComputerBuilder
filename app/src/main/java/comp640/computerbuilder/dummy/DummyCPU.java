package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 5/1/16.
 */
public class DummyCPU implements IDummyParts{
    private List<Part> cpu;

    public DummyCPU()
    {
        cpu = new ArrayList<>();

        cpu.add(new Part(456, "Intel i7", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.CPU,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
    }

    public List<Part> getParts() {return cpu;}
}
