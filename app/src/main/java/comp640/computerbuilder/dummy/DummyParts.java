package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 4/24/16.
 */
public class DummyParts {
    List<Part> dummy = new ArrayList<>();
    public DummyParts()
    {
        dummy.add(new Part(456,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(345,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(56,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(6765,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(567,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(167,"GeForce 770R", BuildStore.Newegg, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(24,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM and a great ability to handle all games and programs", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        dummy.add(new Part(170,"GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
            "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        dummy.add(new Part(30,"GeForce 770R", BuildStore.Newegg, "The Most powerful GPU With 1mb of RAM", "GeForce", PartType.Audio_Video_Card,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));

public class DummyParts{

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
