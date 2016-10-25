package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
   private String address,name;
    private int  color,weight,age;
    public void initialize(String name){
        this.name =  name;
        color = 0;
        address = null;
        weight = 5;
        age = 1;

}
    public void initialize(String name,int weight,int age){
        this.name =  name;
        color = 0;
        address = null;
        this.weight = weight;
        this.age = age;

    }
    public void initialize(String name,int age){
        this.name =  name;
        color = 0;
        address = null;
        weight = 5;
        this.age = age;

    }
    public void initialize(int weight,int color){
        name =  null;
        this.color = color;
        address = null;
        this.weight = weight;
        age = 1;

    }
    public void initialize(int weight,int color,String address){
        name =  null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;

    }
}
