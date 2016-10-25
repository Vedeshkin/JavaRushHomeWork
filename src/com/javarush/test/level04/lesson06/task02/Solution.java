package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);
        num = reader.readLine();
        int b = Integer.parseInt(num);
        num = reader.readLine();
        int c = Integer.parseInt(num);
        num = reader.readLine();
        int d = Integer.parseInt(num);
        if( a > b && a > c && a > d)
            System.out.println(a);
        if (b > a && b > c && b > d)
            System.out.println(b);
        if (c > a && c > b && c > d)
            System.out.println(c);
        if( d > b && d > c && d > a)
       System.out.println(d);




    }
}
