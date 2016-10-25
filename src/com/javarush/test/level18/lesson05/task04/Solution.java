package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        FileOutputStream fo = new FileOutputStream(br.readLine());
        byte [] buffer = new byte[fs.available()];
        fs.read(buffer);
        for(int j = buffer.length-1;j >= 0;j--)
        {
            fo.write(buffer[j]);
        }
        fs.close();
        fo.close();
        br.close();
    }
}
