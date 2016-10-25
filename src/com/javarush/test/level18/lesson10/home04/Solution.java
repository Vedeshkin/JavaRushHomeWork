package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file_output = br.readLine();
        String file_input = br.readLine();

        FileInputStream fis = new FileInputStream(file_output);
        FileInputStream fis2 =new FileInputStream(file_input);
        byte[] buffer = new byte[fis.available()];
        byte[] buffer1 = new byte[fis2.available()];
        fis.read(buffer);
        fis2.read(buffer1);
        fis.close();
        fis2.close();
        FileOutputStream fo = new FileOutputStream(file_output,false);
        fo.write(buffer1);
        fo = new FileOutputStream(file_output,true);
        fo.write(buffer);

        fo.close();
        br.close();

    }
}
