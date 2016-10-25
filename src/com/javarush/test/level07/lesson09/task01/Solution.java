package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> my = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            my.add(Integer.parseInt(read.readLine()));

        }

        ArrayList<Integer> m1 = new ArrayList<Integer>();
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        ArrayList<Integer> m3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i ++)
        {
            if (my.get(i) % 3 == 0 && my.get(i) % 2 == 0)
            {
                m1.add(my.get(i));
                m2.add(my.get(i));
                continue;
            }
            if (my.get(i) % 3 == 0)
            {
                m1.add(my.get(i));
                continue;
            }
            if (my.get(i) % 2 == 0)
            {
                m2.add(my.get(i));
                continue;
            }
            m3.add(my.get(i));

        }
        printList(m1);
        printList(m2);
        printList(m3);

    }


    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i ++)
        {
            System.out.println(list.get(i));
        }
    }
}
