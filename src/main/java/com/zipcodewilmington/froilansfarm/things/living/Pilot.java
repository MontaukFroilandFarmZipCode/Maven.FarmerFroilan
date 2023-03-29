package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;

public class Pilot extends Person implements Rider<AirCraft> {
    @Override
    public boolean mount() {
        return false;
    }

    @Override
    public boolean dismount() {
        return false;
    }
}
