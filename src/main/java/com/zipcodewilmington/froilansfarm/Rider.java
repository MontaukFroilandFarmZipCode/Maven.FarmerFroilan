package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
    public boolean mount();
    public boolean dismount();
}
