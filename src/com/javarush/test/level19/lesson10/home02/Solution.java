package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
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
        double max = 0.0;
        while ((lineToParse = inputReader.readLine()) != null)
        {

            String  [] values  = lineToParse.split(" ");
            String key = values[0];
            double amount = Double.parseDouble(values[1]);
            if (salary.containsKey(key)){
                double currentAmount =  salary.get(key);
                double totalAmount = currentAmount+amount;
                salary.put(key,totalAmount);
                max = max > totalAmount ? totalAmount : max;
                continue;
            }
            salary.put(key,amount);
            max = max > amount ? max : amount;
        }
        inputReader.close();

    }
}
