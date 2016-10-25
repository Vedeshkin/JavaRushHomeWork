package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        FileOutputStream fo1 = new FileOutputStream(br.readLine());
        FileOutputStream fo2 = new FileOutputStream(br.readLine());
        br.close();
        int FileSize = fs.available();
        byte[] buffer = new byte[FileSize];
        fs.read(buffer);
        if(!(FileSize % 2 == 0)){
            int fileSize1 = FileSize / 2 + (FileSize % 2);
            int fileSize2 = FileSize / 2;
            fo1.write(buffer,0,fileSize1);
            fo2.write(buffer,fileSize1,fileSize2);

        } else
        {

            fo1.write(buffer, 0, FileSize / 2);
            fo2.write(buffer, FileSize / 2, FileSize / 2);
        }
        fs.close();
        fo1.close();
        fo2.close();




    }
}
