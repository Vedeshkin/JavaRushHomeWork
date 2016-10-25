package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
      StackTraceElement[] m1 = Thread.currentThread().getStackTrace();
        return m1;

    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] m2 = Thread.currentThread().getStackTrace();
        return m2;

    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] m3 = Thread.currentThread().getStackTrace();
        return m3;

    }

    public static StackTraceElement[] method4()
    {
        method5();
        StackTraceElement[] m4 = Thread.currentThread().getStackTrace();
        return m4;

    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] m5 =Thread.currentThread().getStackTrace();
        return m5;

    }
}
