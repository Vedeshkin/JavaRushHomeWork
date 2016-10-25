package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        FileInputStream  fs = new FileInputStream(args[0]);
        while(fs.available()>0)
        {
             int i  = fs.read();
            if(map.containsKey(i)){
                int count = map.get(i) + 1;
                map.put(i,count);
            } else {map.put(i,1);}

        }
        ArrayList<Integer> keys = new ArrayList<Integer>();
        keys.addAll(map.keySet());
        Collections.sort(keys);
        for (int i : keys)
        {
            System.out.println((char)i + " " + map.get(i));
        }
        fs.close();
    }
}
