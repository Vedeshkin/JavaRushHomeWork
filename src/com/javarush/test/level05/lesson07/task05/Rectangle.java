package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top,left,width,height;
    public void initialize(){
        top = 5;
        left = 2;
        width = 10;
        height = 5;

    }
    public void initialize(Rectangle rect){
        this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.height;

    }
    public void initialize(int height)
    {
        top = 5;
        left = 2;
        width = height;
        this.height = height;
    }
    public void initialize(int top,int left)
{
    this.top = top;
    this.left = left;
    width = 0;
    height = 0;
}
    public void initialize(int height ,int width,int top)
{
    this.top = top;
    left = 2;
    this.width = width;
    this.height = height;
}

}
