package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandF1 = new Human("Дед1", true, 55, null,null);
        Human grandF2 = new Human("Дед2", true, 60, null, null);
        Human grandM1 = new Human("Бабка1", false, 54, null, null);
        Human grandM2 = new Human("Бабка2", false, 55, null, null);
        Human father1 = new Human("Сергей", true, 25, grandF1, grandM1);
        Human mother1 = new Human("Мамка", false, 24, grandF2, grandM2);
        Human son = new Human("Сына", true, 4, father1, mother1);
        Human daugther = new Human("Доча", false, 5, father1, mother1);
        Human son2 = new Human("Сына2", true, 3, father1, mother1);

        System.out.println(grandF1);//напишите тут ваш код
        System.out.println(grandF2);//напишите тут ваш код
        System.out.println(grandM1);//напишите тут ваш код
        System.out.println(grandM2);//напишите тут ваш код
        System.out.println(father1);//напишите тут ваш код
        System.out.println(mother1);//напишите тут ваш код
        System.out.println(son);//напишите тут ваш код
        System.out.println(daugther);//напишите тут ваш код
        System.out.println(son2);//напишите тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }//напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
