package com.zipcodewilmington.froilansfarm;

public interface Producer<T extends Edible>{
    public void yield(T Edible);
}
