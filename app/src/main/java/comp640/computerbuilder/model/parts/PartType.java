package comp640.computerbuilder.model.parts;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by alexanderturner on 4/18/16.
 */
public enum PartType {
    CPU,
    Memory,
    Motherboard,
    Audio_Video_Card,
    Cooling,
    Case,
    Operating_System;


    @Override
    @JsonIgnore
    public String toString() {
        return super.toString().replace("_"," ");
    }

}
