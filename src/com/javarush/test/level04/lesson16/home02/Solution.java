package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if ( x < y && x < z){
            System.out.print(y < z ? y : z);
        }
        if ( y < x && y < z){
            System.out.print(x < z ? x : z);
        }
        if ( z < x && z < y){
            System.out.print(y < x ? y : x);
        }
    }
}
