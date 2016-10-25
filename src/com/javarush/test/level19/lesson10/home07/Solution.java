package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        FileWriter output = new FileWriter(args[1],true);
        String line;
        String out = "";
        String words[];
        while((line=input.readLine())!=null){
            words = line.split(" ");
            for (String word: words){
                if(word.length() > 6){
                    out = out+" "+word;
                }
            }
        }
        output.write(out.trim().replaceAll(" ",","));
        input.close();
        output.close();
    }
}
