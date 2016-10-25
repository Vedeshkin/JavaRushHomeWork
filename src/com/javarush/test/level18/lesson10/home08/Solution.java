package com.javarush.test.level18.lesson10.home08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        while(!(s= br.readLine()).equals("exit")) {
            new ReadThread(s).run();
        }
        br.close();
        for (Map.Entry<String,Integer> entry : resultMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        public void run ()
        {
            try
            {
                FileInputStream fs = new FileInputStream(fileName);
                HashMap<Integer,Integer> symbol = new HashMap<Integer, Integer>();
                while (fs.available() > 0)
                {
                    int i = fs.read();
                    if (!symbol.containsKey(i)){
                        symbol.put(i,1);
                    } else
                    {
                        symbol.put(i,symbol.get(i)+ 1);
                    }
                }
                fs.close();
                int maxValueInMap=(Collections.max(symbol.values()));
                for (Map.Entry<Integer, Integer> entry : symbol.entrySet()) {
                    if (entry.getValue()==maxValueInMap) {
                        resultMap.put(fileName,entry.getKey());
                    }
                }


            }catch (Exception ex ){}
        }
    }
}
