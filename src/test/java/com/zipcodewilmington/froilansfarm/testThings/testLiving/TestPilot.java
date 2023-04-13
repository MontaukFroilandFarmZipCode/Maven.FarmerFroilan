package com.zipcodewilmington.froilansfarm.testThings.testLiving;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.things.living.Pilot;
import com.zipcodewilmington.froilansfarm.things.machine.AirCraft;
import com.zipcodewilmington.froilansfarm.things.plant.CornEars;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPilot {
    Pilot pilot = new Pilot();
    AirCraft airCraft = new AirCraft();

    @Test
    public void makeNoiseTest() {

        String expected = "Bombs Away!";
        String actual = pilot.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest() {

        boolean expected = true;
        boolean actual;

        pilot.mount(airCraft);
        actual = airCraft.getMounted();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void dismountTest() {

        boolean expected = false;
        boolean actual;

        pilot.mount(airCraft);
        pilot.dismount(airCraft);

        actual = airCraft.getMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        ArrayList<Edible> corn = new ArrayList<>(2);
        CornEars cornEars = new CornEars();
        pilot.eat(cornEars);
        int expected = 1;
        corn.add(cornEars);
        Assert.assertTrue(corn.contains(cornEars));
    }
}