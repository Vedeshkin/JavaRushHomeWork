package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> info = new HashMap<String, String>();
        info.put("Ведешкин","Валентин");
        info.put("Ведешкина1","Дарья");
        info.put("Ведешкина2","Ирина");
        info.put("Бардина","Дарья");
        info.put("Фунтиков","Валентин");
        info.put("Ян","Тимаков");
        info.put("Иван","Варг");
        info.put("Том","Круз");
        info.put("Ивановна","Марья");
        info.put("Катерина","Шестакова");

        return info;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iter =  map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();
            if (pair.getValue().equals(name)){
                count++;
            }

        }
return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iter =  map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();
            if (pair.getKey().equals(familiya)){
                count++;
            }

        }
        return count;

    }
}
