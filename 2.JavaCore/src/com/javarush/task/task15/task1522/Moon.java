package com.javarush.task.task15.task1522;

public class Moon implements Planet {

    private static String name = Planet.MOON;
    private static Moon instance = null;
    public static Moon getInstance()
    {
        if (instance==null)
        {
           instance = new Moon();
        }
        return instance;
    }

    private Moon() {
    }
}
