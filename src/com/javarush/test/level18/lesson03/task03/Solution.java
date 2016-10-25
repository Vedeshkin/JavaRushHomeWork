package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> values = new HashMap<Integer,Integer>();
        String file = br.readLine();
        FileInputStream is = new FileInputStream(file);
        while (is.available()> 0)
        {
           int key = is.read();
            if(values.containsKey(key)){
                int value = values.get(key);
                values.put(key,++value);
            }
            else values.put(key,1);

        }
        int mostOften = 0;
        for (Map.Entry<Integer, Integer> pair: values.entrySet()) {
            if (pair.getValue() > mostOften) {
                mostOften = pair.getValue();
                list.clear();
                list.add(pair.getKey());
            }
            else if (pair.getValue() == mostOften) list.add(pair.getKey());
        }
        for (int i:list) System.out.print(i+" ");
    }
}
