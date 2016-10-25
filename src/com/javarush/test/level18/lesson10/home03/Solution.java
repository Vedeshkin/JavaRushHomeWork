package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fo1 = new FileOutputStream(br.readLine(),true);
        FileInputStream fis = new FileInputStream(br.readLine());
        FileInputStream fis2 = new FileInputStream(br.readLine());
         while (fis.available() > 0){
             fo1.write(fis.read());
         }
        while (fis2.available() >0){
            fo1.write(fis2.read());
        }
        fis.close();
        fis2.close();
        fo1.close();
        br.close();
    }
}
