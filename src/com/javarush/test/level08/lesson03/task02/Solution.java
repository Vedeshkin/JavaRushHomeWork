package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> HashMap = new HashMap<String, String>();
        HashMap.put("арбуз","ягода");
        HashMap.put("банан","трава");
        HashMap.put("вишня","ягода");
        HashMap.put("груша","фрукт");
        HashMap.put("дыня","овощ");
        HashMap.put("ежевика","куст");
        HashMap.put("жень-шень","корень");
        HashMap.put("земляника","ягода");
        HashMap.put("ирис", "цветок");
        HashMap.put("картофель","клубень");

        Iterator<Map.Entry<String, String>> iterator = HashMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }

    }
}
