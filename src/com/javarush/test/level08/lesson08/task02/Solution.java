package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(-1);
        set.add(-5);
        set.add(16);
        set.add(20);
        set.add(22);

        return (HashSet<Integer>) set;
        //напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {

            int val  = iterator.next();

            if (val > 10)
            {
                iterator.remove();
            }

            //напишите тут ваш код
        }
        return (HashSet<Integer>) set;
    }
}

