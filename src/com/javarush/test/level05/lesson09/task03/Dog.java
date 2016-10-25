package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name,color;
    private int age;
    public Dog(String name){
        this.name = name;
        color ="Male";
        age = 18;
    }

    public Dog(String name,int age){
        this.name = name;
        color ="Red";
        this.age = age;
    }
    public Dog(String name,int age,String color){
        this.name = name;
        this.color = color;
        this.age = age;
    }
}


