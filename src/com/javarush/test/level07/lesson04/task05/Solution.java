package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] big = new int[20];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big.length; i ++)
        {
            big[i] = Integer.parseInt(read.readLine());

        }
        int[] a = new int[10];
        int[] b = new int[10];
        int i = 0;
        int k = big.length - 1;
        while (i < k)
        {
         a[i] = big[i];
            b[b.length -1 -i] = big[k];
            i++;
            k--;

        }
        for (int j = 0; j < b.length; j++)
        {
            System.out.println(b[j]);
        }
    }
}
