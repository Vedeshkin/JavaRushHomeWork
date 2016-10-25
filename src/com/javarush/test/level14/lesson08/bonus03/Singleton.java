package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by vedeshkin on 12.03.2016.
 */
public class Singleton
{
    private static Singleton instance = null;

    protected Singleton()
    {
    }

    public static  Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

