package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum ;
        int  minimum ;

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
        {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);//напишите тут ваш код
        }

        maximum = array[0];
        minimum = array[0];

        for (int i = 0; i < array.length; i++)
        {

            if (array[i] > maximum)
            {
                maximum = array[i];
            }

            if (array[i] < minimum)
            {
                minimum = array[i];
            }

        }



        System.out.println(maximum + " " + minimum);

    }
}
