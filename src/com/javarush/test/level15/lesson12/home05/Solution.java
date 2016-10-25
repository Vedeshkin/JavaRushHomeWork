package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution

{
    Solution(int a, int b){}
    Solution(char c,char b){}
    Solution(boolean b){}

    public Solution(){}
    public Solution(Integer i){}
    public Solution (Double d){}

    private Solution(int i){}
    private Solution(char c){}
    private Solution(long l){}

    protected Solution(Object o,Object b){}
    protected Solution(String s,Integer i){}
    protected Solution(String s, Object o){}
}

