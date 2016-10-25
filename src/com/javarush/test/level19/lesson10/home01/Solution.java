package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        HashMap<String,Double> salary = new HashMap<String, Double>();
        BufferedReader inputReader = new BufferedReader(new FileReader(args[0]));
        String lineToParse = "";
        while ((lineToParse = inputReader.readLine()) != null)
        {
            String  [] values  = lineToParse.split(" ");
            if (salary.containsKey(values[0])){
               double currentAmount =  salary.get(values[0]);
                salary.put(values[0],Double.parseDouble(values[1])+currentAmount);
                continue;
            }
            salary.put(values[0],Double.parseDouble(values[1]));
        }
        inputReader.close();
        ArrayList<String> keys = new ArrayList<String>(salary.keySet());
        Collections.sort(keys);
        for(String key : keys){
            System.out.println(key+" "+ salary.get(key));
        }



    }
}
