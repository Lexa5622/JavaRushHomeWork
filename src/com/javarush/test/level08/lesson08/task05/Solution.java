package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Подрыв", " Устоев");
        map.put("Угон", " Камазов");
        map.put("Поджег", " Сараев");
        map.put("Забег", " Дебилов");
        map.put("Камыш", " Устоев");
        map.put("Камаз", " Сараев");
        map.put("Заплыв", " Дебилов");
        map.put("Сарай", " Узбеков");
        map.put("Элтон", " Джонн");
        map.put("Джеймс", " Петтри");

        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
       HashMap<String, String> mapCopy = new HashMap<String, String>(map);


        for (Map.Entry<String, String> pair : mapCopy.entrySet())
        {
            int count = 0;
            String x = pair.getValue();

            for(Map.Entry<String, String> pair1 : map.entrySet())
            {
                String a = pair1.getValue();
                if (a.equals(x))
                {
                    count++;
                }

            }
            if (count > 1){
                removeItemFromMapByValue(map, x);
            }
        }            //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

public static void main(String[] args)
{
    HashMap<String, String> map = createMap();
    removeTheFirstNameDuplicates(map);
    for (Map.Entry<String,String> pair : map.entrySet())
    {
        String key = pair.getKey();
        String value = pair.getValue();
        System.out.println(key + value);
}
}
}


