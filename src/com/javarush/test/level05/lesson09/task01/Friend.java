package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name,sex;
    private int age;
    public Friend(String name){
        this.name = name;
        sex ="Male";
        age = 18;
    }

    public Friend(String name,int age){
        this.name = name;
        sex ="Male";
        this.age = age;
    }
    public Friend(String name,int age,String sex){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}