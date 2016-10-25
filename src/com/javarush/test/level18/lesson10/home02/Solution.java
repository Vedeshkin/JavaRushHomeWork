package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream fs = new FileInputStream(args[0]);
        double count = fs.available();
        double space = 0;
        while (fs.available() > 0)
        {
            if(fs.read()== 32) space++;
        }
        float resutl = (float) ((float)space/count*100.0);
        System.out.println(String.format(Locale.ENGLISH,"%.2f", resutl));
        fs.close();

    }
}
