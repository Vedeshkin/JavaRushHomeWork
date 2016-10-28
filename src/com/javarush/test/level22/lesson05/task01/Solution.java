package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {

        if (string == null || string.isEmpty()) throw  new TooShortStringException();

  int firstindex  = string.indexOf(" ")+1;
        if (firstindex == -1) throw new TooShortStringException();


        char [] str = string.toCharArray();
        int count = 0;
        int lastIndex = 0;
        for (int i = 0;i<str.length;i++)
        {
           if (str[i] == ' ') ++count;
            if(count == 4) lastIndex = i;
        }
        if(lastIndex == 0)  throw  new TooShortStringException();



        return string.substring(firstindex,lastIndex+1);
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
    public static class TooShortStringException extends  Exception {
    }
}
