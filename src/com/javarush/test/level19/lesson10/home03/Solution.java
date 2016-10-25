package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{
        String file = args[0];
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while((line = br.readLine())!= null)
        {
            String[] dataToParse = line.split(" ");
            PEOPLE.add(new Person(parseName(dataToParse),parsedate(dataToParse)));

        }
        br.close();
    }

    static Date parsedate(String [] dataToParse) throws Exception
    {
        String dateAsString ="";
        Date parsedDate;
        for (int i=dataToParse.length-3;i<=dataToParse.length-1;i++){

            dateAsString += dataToParse[i] +" ";

        }
        parsedDate = new  SimpleDateFormat("dd MM yyyy").parse(dateAsString);
        return parsedDate;
    }

    static String parseName(String [] dataToParse )
    {
        String nameAsString = "";
        for(int i = 0;i<dataToParse.length-3;i++){
            nameAsString += dataToParse[i] + " ";

        }
        return nameAsString.trim();
    }

}
