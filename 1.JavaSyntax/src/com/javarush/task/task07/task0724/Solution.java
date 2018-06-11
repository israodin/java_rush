package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human1 = new Human("Vasya",true,45);
        Human human2 = new Human("Anya",false,35);
        Human human3 = new Human("Jora",true,75);
        Human human4 = new Human("Nora",false,65);

        Human human5 = new Human("Petya",true,15,human1,human2);
        Human human6 = new Human("Katya",false,25,human1,human2);
        Human human7 = new Human("Galya",false,18,human3,human4);
        Human human8 = new Human("Nick",true,28,human3,human4);
        Human human9 = new Human("Pol",true,21,human1,human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);

    }

    public static class Human {
        //напишите тут ваш код
        String name ;
        boolean sex ;
        int age;
        Human father;
        Human mother;

        public Human(String name , boolean sex,int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name,boolean sex,int age,Human father,Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
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






















