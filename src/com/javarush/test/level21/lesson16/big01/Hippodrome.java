package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vedeshkin on 28.10.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    private ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }


    public static void main(String[] args)
    {

        game = new Hippodrome();
        Horse h1 = new Horse("Hourse1",3,0);
        Horse h2 = new Horse("Hourse2",3,0);
        Horse h3 = new Horse("Hourse3",3,0);
        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);
        try
        {
            game.run();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        game.printWinner();
    }
    public void run() throws InterruptedException
    {
        for (int i =0;i<=99;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void print(){
        for (Horse h: getHorses())
        {
            h.print();
        }
        System.out.println();
    }
    public void move(){
        for (Horse h: getHorses())
        {
            h.move();
        }
    }
    public Horse getWinner()
    {
        double max = 0;
        Horse winner = null;
        for (Horse h : getHorses())
        {
            max = h.getDistance() > max?h.getDistance():max;
        }
        for (Horse h : getHorses())
        {
            if (h.getDistance() == max ) winner = h;
        }
        return winner;

    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

}
