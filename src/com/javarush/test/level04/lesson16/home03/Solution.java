package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        while (true){
            int j = Integer.parseInt(reader.readLine());
            if (j != -1){
                i = i + j;
            }
            else
            {
                i = i + j;
                System.out.print(i);
                break;
            }

            }
    }
}
