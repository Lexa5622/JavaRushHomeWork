package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Swarts", new Date("JANUARY 1 1980"));
        map.put("Trump", new Date("FEBRUARY 23 1987"));
        map.put("Putin", new Date("MARCH 30 1999"));
        map.put("Obama", new Date("APRIL 6 1985"));
        map.put("Chicatilo", new Date("AUGUST 1 1980"));
        map.put("Mudak", new Date("SEPTEMBER 1 1980"));
        map.put("Friend", new Date("JULY 1 1980"));
        map.put("GirlFriend", new Date("DECEMBER 1 1980"));
        map.put("Whole", new Date("JULY 1 1982"));

        return map;//напишите тут ваш код

    }


    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> mapCopy = new HashMap<String, Date>(map);
        for(Map.Entry<String, Date> pair : mapCopy.entrySet())
        {
            if (pair.getValue().getMonth()>=5 && pair.getValue().getMonth() <= 7 )
            {
                map.remove(pair.getKey());
            }
                    //напишите тут ваш код
        }

    }
}
