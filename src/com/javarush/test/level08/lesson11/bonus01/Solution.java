package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> month = new ArrayList<String>();
        month.add("JANUARY");
        month.add("FEBRUARY");
        month.add("MARCH");
        month.add("APRIL");
        month.add("MAY");
        month.add("JUNE");
        month.add("JULY");
        month.add("AUGUST");
        month.add("SEPTEMBER");
        month.add("OCTOBER");
        month.add("NOVEMBER");
        month.add("DECEMBER");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s =  read.readLine();
       // s = s.trim();
        System.out.println(s +" is " +(month.indexOf(s.toUpperCase())+ 1)+" month");


    }

}
