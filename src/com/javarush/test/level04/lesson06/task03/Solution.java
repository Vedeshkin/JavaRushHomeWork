package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if ((a > c) && (a > b)){
        System.out.println(a);
            if (b > c)
            {
                System.out.println(b);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b > c && b > a)
        {
            System.out.println(b);

            if (a > c)
            {
                System.out.println(a);
                System.out.println(c);
            } else
            {
                System.out.println(c);
                System.out.println(a);
            }
        }
            else if (c > a  && c > b)
        {
            System.out.println(c);

            if (b > a)
            {
                System.out.println(b);
                System.out.println(a);
            } else
            {
                System.out.println(a);
                System.out.println(b);
            }

        }
    }
}
