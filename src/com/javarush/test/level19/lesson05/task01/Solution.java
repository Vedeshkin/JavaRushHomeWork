package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;
import java.util.Properties;

public class Solution {
    public static void main(String[] args)
    {
    String s1,s2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            s1 = br.readLine();
            s2 = br.readLine();
            FileReader fr = new FileReader(s1);
            FileWriter fw = new FileWriter(s2);
            int i = 0;
            while (fr.ready())
            {
                i++;
                if (i % 2 == 0) fw.write(fr.read());


            }
            br.close();
            fr.close();
            fw.close();
        }catch (IOException ie  ){}

    }

}
