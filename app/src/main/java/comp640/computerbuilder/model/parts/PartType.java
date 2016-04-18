package comp640.computerbuilder.model.parts;

/**
 * Created by alexanderturner on 4/18/16.
 */
public enum PartType {
    CPU,
    Memory,
    Motherboard,
    Audio_Video_Card,
    Cooling,
    Operating_System;

    @Override
    public String toString() {
        return super.toString().replace("_"," ");
    }

}
