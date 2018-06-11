package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static String name = Planet.EARTH;
    private static Earth instance = null;


    public static  Earth getInstance() {
        if (instance ==null)
        {
            instance  = new Earth();
        }
        return instance;
    }

    private Earth() {
    }
}
