package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int j = 0;
        while (true){
            String a = reader.readLine();
            if (a.equals("сумма")){
                System.out.println(j);
                break;
            }
            else{
                j = j + Integer.parseInt(a);

            }


    }
    }
}
