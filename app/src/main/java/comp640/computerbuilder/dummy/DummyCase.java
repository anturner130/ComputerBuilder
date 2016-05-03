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

        _case.add(new Part(95, "HAF XB EVO - High Air Flow Test Bench and LAN Box Desktop Computer Case with ATX Motherboard Support", BuildStore.Newegg, "The Cooler Master HAF XB EVO offers a perfect blend of design, performance and function in a unique cube design that stands out immediately. It comes in a dual-layer design to accommodate your high-performance components in an ultra compact footprint. You can cram an ATX motherboard, VGA card up to 334mm in length, and CPU cooler up to 180mm in height, and mix and match multiple ODD, HDD, and SSD to meet your storage needs. All the components are efficiently and effectively cooled thanks to the superb thermal solution, which already includes two pre-installed fans, meshed panels and can be upgraded in future with extra fans and water cooling. The motherboard tray can be removed for easy installation and debugging. And with the recessed handles, you can easily transport your gaming rig to a LAN party and show off your gaming prowess.", "Cooler Master", PartType.Case,
                "http://images17.newegg.com/is/image/newegg/20-231-937-TS?$S300W$"));
        _case.add(new Part(98, "D780-BK Black SECC ATX Full Tower Computer Case", BuildStore.Amazon, "Full black interior, Intel TAC 2.0 \n" +
                "Water Cooling ready\n" +
                "120mm or 240mm water cooling x front (Optional) \n" +
                "120mm, 240mm or 360mm water cooling x top (Optional)\n" +
                "Advanced cable management design\n" +
                "Advanced Bottom-Mounted PSU Design\n" +
                "Integrated 3 channel fan speed controller - control front, top, rear fans\n" +
                "Top mounted IO ports ñ 2x USB 3.0 for up-to-date high speed data transfer\n" +
                "Screw-less design for 5.25î ODD and 3.5\" HDD /SSD\n" +
                "Front panel dust-proof mesh design; dust filter on top/bottom panel \n" +
                "Build in 5 x 120mm blue LED fans provide great cooling performance\n" +
                "8 PCI slots provide flexibility for multiple graphics cards solutions.\n" +
                "Support up to 170mm CPU cooler\n" +
                "Support up to 430MM VGA card with HDD cage removed", "DIYPC", PartType.Case,
                "http://images17.newegg.com/is/image/newegg/11-353-086-TS?$S640W$"));
        _case.add(new Part(39, "HAF XB EVO - High Air Flow Test Bench and LAN Box Desktop Computer Case with ATX Motherboard Support", BuildStore.Newegg, "The Cooler Master HAF XB EVO offers a perfect blend of design, performance and function in a unique cube design that stands out immediately. It comes in a dual-layer design to accommodate your high-performance components in an ultra compact footprint. You can cram an ATX motherboard, VGA card up to 334mm in length, and CPU cooler up to 180mm in height, and mix and match multiple ODD, HDD, and SSD to meet your storage needs. All the components are efficiently and effectively cooled thanks to the superb thermal solution, which already includes two pre-installed fans, meshed panels and can be upgraded in future with extra fans and water cooling. The motherboard tray can be removed for easy installation and debugging. And with the recessed handles, you can easily transport your gaming rig to a LAN party and show off your gaming prowess.", "Cooler Master", PartType.Case,
                "http://images17.newegg.com/is/image/newegg/11-119-265-TS?$S640$"));

    }

    public List<Part> getParts() {return _case;}
}
