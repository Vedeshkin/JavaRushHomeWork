package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution
{
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static
    {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());


    }


    public static class MyThread1 extends Thread
    {
        public void run()
        {
            while (!isInterrupted())
            {
            }

        }
    }

    public static class MyThread2 extends Thread
    {
        public void run()
        {
            while(!isInterrupted())
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException ex)
                {
                    System.out.println("InterruptedException");
                }
            }

        }
    }
    public static class MyThread3 extends Thread
    {
        public void run()
        {
            while(!isInterrupted()){
                try
                {
                    System.out.println("Ура");
                    sleep(500);

                }catch (InterruptedException ex){}
            }
        }
    }

    public static class MyThread4 extends Thread implements Message
    {
        public void run()
        {
            while (!isInterrupted()){}
        }

        @Override
        public void showWarning()
        {
            this.interrupt();
            this.stop();
        }
    }

    public static class MyThread5 extends Thread
    {
        public void run()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int value =0;
            while(true)
            {
                try
                {
                    String s = br.readLine();
                    if(!s.equals("N"))
                    {
                        value = value + Integer.parseInt(s);
                    }
                    if(s.equals("N"))
                    {
                        System.out.println(value);
                        break;
                    }
                }catch (Exception e){}

            }
        }
    }

}