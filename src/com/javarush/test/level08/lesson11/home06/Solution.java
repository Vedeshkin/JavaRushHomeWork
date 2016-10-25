package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {


        Human child1 = new Human("Дитё1",true,5,null);
        Human child2 = new Human("Дитё2",false,10,null);
        Human child3 = new Human("Дитё3",false,3,null);
        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(child1);childs.add(child2);childs.add(child3);

        Human father = new Human("Отец",false,85,childs);
        ArrayList<Human>  parent1 = new ArrayList<Human>();
        parent1.add(father);
        Human mother = new Human("Мама",true,55,childs);
        ArrayList<Human> parrent2 = new ArrayList<Human>();
        parrent2.add(mother);

        Human grandfather1 = new Human("Дед1",true,90,parent1);
        Human grandfather2 = new Human("Дед2",true,87,parrent2);
        Human grandmother1 = new Human("Бабушка1",false,85,parent1);
        Human grandmother2 = new Human("Бабушка2",false,85,parrent2);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private  int age;
        ArrayList<Human> children;
     public Human(String name, boolean sex,int age,ArrayList<Human> children)
     {
         this.name = name;
         this.sex = sex;
         this.age = age;
         if (children != null){this.children = children;}
         else { this.children = new ArrayList<Human>();}
     }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
