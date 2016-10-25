package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String filename;
        String line;
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        br.close();
        InputStream in = new FileInputStream(new File(filename));
        br = new BufferedReader(new InputStreamReader(in));
        while((line = br.readLine())!= null){
        list.add(Integer.parseInt(line));
    }
        Collections.sort(list);
        for(int i : list){
            if (i%2== 0){
                System.out.println(i);
            }
        }

    }
}
