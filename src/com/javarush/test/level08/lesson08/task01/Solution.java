package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet <String> setHash = new HashSet<String>();
        setHash.add("Лошадь");
        setHash.add("Леопард");
        setHash.add("Лес");
        setHash.add("Лопух");
        setHash.add("Лесник");
        setHash.add("Лист");
        setHash.add("Лёд");
        setHash.add("Лом");
        setHash.add("Лук");
        setHash.add("Ледоруб");
        setHash.add("Лакомка");
        setHash.add("Лиса");
        setHash.add("Лиственница");
        setHash.add("Лето");
        setHash.add("Лего");
        setHash.add("Лак");
        setHash.add("Леприконы");
        setHash.add("Лужа");
        setHash.add("Легко");
        setHash.add("Ласты");

        return setHash;
    }
}
