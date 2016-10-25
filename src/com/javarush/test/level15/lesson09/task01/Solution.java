package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(3.14,"One");
        labels.put(1.11,"Two");
        labels.put(2.12,"Three");
        labels.put(3.21,"Four");
        labels.put(5.11,"Fuck the system");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
