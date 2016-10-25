package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        int cnt = 0;
        while(fs.available() > 0)
        {
            if(fs.read() == 44) cnt++;

        }
        System.out.println(cnt);
        fs.close();
        br.close();
    }
}
