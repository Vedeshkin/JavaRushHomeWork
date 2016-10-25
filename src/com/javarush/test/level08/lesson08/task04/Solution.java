package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Vedeshkin", new Date("MAY 15 1991"));
        map.put("Dasha", new Date("MARCH 13 1992"));
        map.put("Vasia",new Date("APRIL 1 1993"));
        map.put("Dima",new Date("DECEMBER 1 1993"));
        map.put("SVETA",new Date("MAY 8 1989"));
        map.put("Arti",new Date("SEPTEMBER 20 1991"));
        map.put("PAVEL",new Date("AUGUST 1 1989"));
        map.put("Sergey", new Date("DECEMBER 13 1992"));
        map.put("Padik", new Date("MARCH 28 1993"));


        return map;

    }
    public static void removeAllSummerPeople(HashMap<String, Date> map){

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Date> row = iterator.next();
            Date d = row.getValue();
            if(d.getMonth() == 5 || d.getMonth() == 6 || d.getMonth() == 7){

                iterator.remove();
            }
        }

    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map.toString());

}
}
