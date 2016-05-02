package comp640.computerbuilder.dummy;

import java.util.ArrayList;
import java.util.List;

import comp640.computerbuilder.model.build.BuildStore;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

/**
 * Created by alexanderturner on 4/25/16.
 */
public class DummyAudioVideoCards implements IDummyParts{

    private PartType type = PartType.Audio_Video_Card;
    private List<Part> audioVideoCards;

    public List<Part> getParts() {return audioVideoCards;}

    public DummyAudioVideoCards()
    {
        audioVideoCards = new ArrayList<>();

        audioVideoCards.add(new Part(456, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(345, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        audioVideoCards.add(new Part(56, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(6765, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        audioVideoCards.add(new Part(567, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(170, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        audioVideoCards.add(new Part(167, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(170, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        audioVideoCards.add(new Part(170, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(24, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM and a great ability to handle all games and programs", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
        audioVideoCards.add(new Part(170, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://www.mwave.com.au/images/150/ab64052_6.jpg"));
        audioVideoCards.add(new Part(30, "GeForce 770R", BuildStore.Amazon, "The Most powerful GPU With 1mb of RAM", "GeForce", type,
                "http://smartcomp-pa.com/catalog/images/EVGA%20210.jpg"));
    }



}
