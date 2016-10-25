package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        load(new FileInputStream(filename));
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties config = new Properties();
        config.putAll(properties);
        config.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties config = new Properties();
        config.load(inputStream);
        for(Object key: config.keySet()){
            properties.put(key.toString(),config.get(key).toString());
        }
    }
}
