package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String sAge = reader.readLine();
        int n = Integer.parseInt(sAge);
        int a = 0;
        while (a < n)
        {
            System.out.println(s1);
            a++;
        }

    }
}
