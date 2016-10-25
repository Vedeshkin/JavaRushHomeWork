package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Vaska","Some",12);
        Man man2 = new Man("Peter","somewhere",13);
        Woman w1 = new Woman("Dasha","VLZ",23);
        Woman w2 = new Woman("Ira","VLZ",56);

    }

    public static class Man
    {
        private String name, address;
        int age;
        public Man(String name,String address,int age){
            this.name = name;
            this.address = address;
            this.age = age;
            System.out.println(this.name + " " + this.age + " " + this.address);

        }

    }


    public static  class Woman
    {
        private String name, address;
        int age;
        public Woman(String name,String address,int age){
            this.name = name;
            this.address = address;
            this.age = age;
            System.out.println(name + " " + age + " " + address);

        }

    }
}
