package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++)
        {
            list.add(Integer.parseInt(read.readLine()));
        }
        for (int i = list.size() - 1; 0 <= i; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
