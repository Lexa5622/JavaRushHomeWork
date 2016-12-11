package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Петрова", "Анна");
        map.put("Сидорова", "Саша");
        map.put("Сидоров", "Сергей");
        map.put("Васечкин", "Петя");
        map.put("Иванов", "Паша");
        map.put("Иванова", "Даша");
        map.put("Петров", "Ваня");
        map.put("Плюшкина", "Зоя");
        map.put("Ресничкина", "Юля");
        map.put("Камазов", "Угон");
        return (HashMap<String, String>) map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();

            if(pair.getValue().equals(name))
            {
                count++;
            }//напишите тут ваш код
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();

            if (pair.getKey().equals(lastName))
            {
                count++;//напишите тут ваш код
            }
        }
        return count;
    }
}
