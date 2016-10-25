package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name,address;
    private  int weight,age,color;
    public Cat(String name){
        this.name = name;
        weight = 1;
        age = 1;
        color = 255;
        address = null;

    }
    public Cat(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = 255;
        address = null;

    }
    public Cat(String name,int age){
        name = name;
        this.weight = 1;
        this.age = age;
        color = 255;
        address = null;

    }
    public Cat(int weight,int color){
        this.name = null;
        this.weight = weight;
        this.age = age;
        this.color = color;
        address = null;

    }
    public Cat(int weight,int color,String address){
        name = null;
        this.weight = weight;
        age = 1;
        this.color = color;
        this.address = address;

    }
}
