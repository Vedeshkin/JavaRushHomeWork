package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{




    public static HashMap<String, String> createMap()
    {
        HashMap<String, String>  mapFio = new HashMap<String, String>();
        mapFio.put("Vedeshkina","Daria");
        mapFio.put("Jivelev","Jivelev");
        mapFio.put("Orlova","Daria");
        mapFio.put("Vale4ka","Funtikov");
        mapFio.put("Someone","NoNeVedeshkin");
        mapFio.put("Wooody","WoodPeacker");
        mapFio.put("Dandy", "Sega");
        mapFio.put("PS1", "PS2");
        mapFio.put("Dreamcast","Funtikov");
        mapFio.put("Novikov","PS2");
         return mapFio;




    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        String s = "";
        ArrayList<String> names = new ArrayList<String>(map.values());
        for ( int i = 0; i < names.size(); i++ )
        {
            s = names.get(i);
            int count = 0;
            for (String name  : names)
            {
                if (name.equals(s)){ count++; }
                if ( count > 1) {removeItemFromMapByValue(map,s);}

            }
        }


        //
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
