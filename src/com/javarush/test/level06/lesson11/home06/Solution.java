package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss ass1 = new KissMyShinyMetalAss("Silver");
        System.out.println(ass1);
    }

    public static class KissMyShinyMetalAss
    {
        String ass;
        public KissMyShinyMetalAss(String ass){
            this.ass = ass;
        }
    }

}
