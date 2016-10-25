package com.javarush.test.level18.lesson03.task01;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        file = br.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        long max = 0;
        while(inputStream.available() > 0)
        {
            int tmp = inputStream.read();
            if (tmp > max) max = tmp;
        }
        inputStream.close();
        System.out.println(max);
    }
}
