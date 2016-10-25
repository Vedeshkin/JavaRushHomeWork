package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution  {
    public static void main(String[] args) throws DownloadException,Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs;
        String file = "";
        while(true)
        {
            file = br.readLine();
            fs = new FileInputStream(file);
            if(fs.available() < 1000)
            {
                fs.close();
                br.close();
                throw new DownloadException();

            }

        }

    }

    public static class DownloadException extends Exception{

    }
}
