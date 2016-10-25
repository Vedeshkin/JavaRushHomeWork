package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file_input = br.readLine();
        String file_output = br.readLine();
        BufferedReader brf = new BufferedReader(new FileReader(file_input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file_output));
        String s;
        while((s= brf.readLine())!= null)
        {
            String tmp[] = s.split(" ");
            for( String value : tmp)
            {
                int i = (int)Math.round(Double.parseDouble(value));
                bw.write(String.valueOf(i)+ " ");

            }
        }
        bw.close();
        brf.close();
        br.close();



    }
}
