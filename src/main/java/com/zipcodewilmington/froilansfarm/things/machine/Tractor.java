package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;
import com.zipcodewilmington.froilansfarm.storage.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public void harvest() {
    }

    @Override
    public boolean farmOperation() {
        return false;
    }
}
