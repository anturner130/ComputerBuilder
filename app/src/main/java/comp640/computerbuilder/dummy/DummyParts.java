package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by deandubois on 4/24/16.
 */
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
