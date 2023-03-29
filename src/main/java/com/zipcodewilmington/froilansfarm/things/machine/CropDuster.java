package com.zipcodewilmington.froilansfarm.things.machine;

import com.zipcodewilmington.froilansfarm.FarmVehicle;

public class CropDuster extends AirCraft implements FarmVehicle {
    public void fertilize(){

    }

    @Override
    public boolean farmOperation() {
        return false;
    }
}
