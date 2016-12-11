package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buffereReader = new BufferedReader(new InputStreamReader(System.in));
        String a  = buffereReader. readLine();
        int dayOfWeek = Integer.parseInt(a);
        if ((dayOfWeek>7)||(dayOfWeek<1))
        {
            System.out.println("такого дня недели не существует");
        }
        if(dayOfWeek==1)
        {
            System.out.println("понедельник");
        }
        if(dayOfWeek==2)
        {
            System.out.println("вторник");
        }
        if(dayOfWeek==3)
        {
            System.out.println("среда");

        }
        if(dayOfWeek==4)
        {
            System.out.println("четверг");
        }
        if(dayOfWeek==5)
        {
            System.out.println("пятница");
        }
        if(dayOfWeek==6)
        {
            System.out.println("суббота");
        }
        if(dayOfWeek==7)
        {
            System.out.println("воскресенье");
        }//напишите тут ваш код

    }

}