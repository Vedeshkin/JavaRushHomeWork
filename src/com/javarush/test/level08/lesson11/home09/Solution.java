package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 28 2014";

        System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date curDate = new Date(date);
        String firthday = "JANUARY 1 " + (curDate.getYear()+1900);
        Date yearStart = new Date(firthday);
        long  ms = curDate.getTime() - yearStart.getTime();
        int dayCount = (int)(ms/(24*60*60*1000));


        return dayCount % 2 == 0 ? true : false;
    }
}
