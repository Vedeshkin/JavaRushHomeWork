package com.javarush.test.level15.lesson12.home05;

/**
 * Created by vedeshkin on 07.04.2016.
 */
public class SubSolution extends Solution
{
     SubSolution(int a, int b)
    {
        super(a, b);
    }

     SubSolution(boolean b)
    {
        super(b);
    }

    SubSolution(char c, char b)
    {
        super(c, b);
    }



    protected SubSolution(String s, Object o)
    {
        super(s, o);
    }

    protected SubSolution(String s, Integer i)
    {
        super(s, i);
    }

    protected SubSolution(Object o, Object b)
    {
        super(o, b);
    }
    public SubSolution()
    {
        super();
    }
    public SubSolution(Integer i)
    {
        super(i);
    }

    public SubSolution(Double d)
    {
        super(d);

    }
    private SubSolution(int i){}
    private SubSolution(char c){}
    private SubSolution(long l){}
}
