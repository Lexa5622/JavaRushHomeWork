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
        Set<String> createSet = new HashSet<String>();

        createSet.add("Люда");
        createSet.add("Лампа");
        createSet.add("Лента");
        createSet.add("Любовь");
        createSet.add("Лист");
        createSet.add("Люмен");
        createSet.add("Литература");
        createSet.add("Лиственница");
        createSet.add("Люстрация");
        createSet.add("Литва");
        createSet.add("Латвия");
        createSet.add("Лук");
        createSet.add("Лесбиянка");
        createSet.add("Литера");
        createSet.add("Лиса");
        createSet.add("Ладонь");
        createSet.add("Левиафан");
        createSet.add("Линкор");
        createSet.add("Либерал");
        createSet.add("Лидер");

        return (HashSet<String>) createSet;//напишите тут ваш код

    }
}
