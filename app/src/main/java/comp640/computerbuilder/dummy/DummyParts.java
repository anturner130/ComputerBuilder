package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;
import comp640.computerbuilder.model.build.BuildStore;
/**
 * Created by deandubois on 4/24/16.
 */
public class DummyParts {
    List<Part> dummy = new ArrayList<>();



    /**
     * Map containing the parts lists
     */
    private  HashMap<PartType,IDummyParts> _partsMap;

    /**
     * The singleton instance.
     */
    private static DummyParts _singleton;

    /**
     * Private Constructor for singleton
     */
    private DummyParts(){
        _partsMap = new HashMap<>();
        _partsMap.put(PartType.Audio_Video_Card, new DummyAudioVideoCards());
<<<<<<< HEAD
        _partsMap.put(PartType.Case, new DummyCase());
        _partsMap.put(PartType.Cooling, new DummyCooling());
        _partsMap.put(PartType.CPU, new DummyCPU());
        _partsMap.put(PartType.Memory, new DummyMemory());
        _partsMap.put(PartType.Motherboard, new DummyMotherBoard());
        _partsMap.put(PartType.Operating_System, new DummyOperatingSystem());
=======
        _partsMap.put(PartType.Memory, new DummyMemory());
        _partsMap.put(PartType.Motherboard, new DummyMotherboards());
>>>>>>> anturner130/master
    }

    /**
     * The singleton accessor
     * @return the singlton
     */
    public static DummyParts getSingleton(){
        if(_singleton == null)
            _singleton = new DummyParts();
        return _singleton;
    }

    /**
     * Gets parts based on the type
     * @param type the type of part
     * @return the list of dummy parts
     */
    public List<Part> getParts(PartType type){
        if(_partsMap.containsKey(type))
            return _partsMap.get(type).getParts();

        return new ArrayList<Part>();
    };
}
