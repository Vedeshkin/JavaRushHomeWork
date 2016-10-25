package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
           arr[i]=  Integer.parseInt(reader.readLine());
        }

        int minimum = min(arr);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] arr)
    {
        int min = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if ( min > arr[i] )
            {
                min = arr[i];
            }
        }
        return min;
    }


}
