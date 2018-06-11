package com.javarush.task.task15.task1522;

public class Sun implements Planet {

    private static String name = Sun.SUN;
    private static Sun instance = null;

    public static Sun getInstance()
    {
        if (instance==null)
        {
            instance = new Sun();
        }
        return instance;
    }
    private Sun() {
    }
}
