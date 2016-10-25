package com.javarush.test.level14.lesson08.home05;

/**
 * Created by vedeshkin on 24.02.2016.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer()
    {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return this.keyboard;
    }

    public Mouse getMouse()
    {
        return this.mouse;
    }

    public Monitor getMonitor()
    {
        return this.monitor;
    }
}
