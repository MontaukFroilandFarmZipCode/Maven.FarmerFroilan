package com.zipcodewilmington.froilansfarm.things.living;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public abstract class Person extends Animal implements Rider<Rideable> {
    String name;
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
}
