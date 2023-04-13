package com.zipcodewilmington.froilansfarm.things.living;


import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Person extends Animal{

    String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


}
