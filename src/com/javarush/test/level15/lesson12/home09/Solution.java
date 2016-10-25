package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

public class Solution {
    public static void main(String[] args) {
        String s  = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo&viev&obj=VFU";
        String params = s.substring(s.indexOf("?")+1);
        System.out.println(params);
    while (true){
        if (params.contains("&"))
        {
            String param = params.substring(0, params.indexOf("&"));
            //System.out.println(param);
            if (param.contains("=")){
                if (param.substring(0,param.indexOf("=")).contains("obj")){
                    param = param.substring(param.indexOf("=")+1,param.length());
                    try{
                       double d =  Double.parseDouble(param);
                        alert(d);
                    }catch (Exception ex){alert(param);}
                } else {
                    System.out.print(param);
                    System.out.print(" ");
                }
            }

            params = params.substring(params.indexOf("&") + 1, params.length());
        } else {
            if (params.contains("=")){
            if (params.substring(0,params.indexOf("=")).contains("obj")){
                params = params.substring(params.indexOf("=")+1,params.length());
                try{
                    double d =  Double.parseDouble(params);
                    alert(d);
                }catch (Exception ex){alert(params);}
            } else {
                System.out.print(params.substring(0,params.indexOf("=")));
                System.out.print(" ");
            }
        }
            break;}
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
