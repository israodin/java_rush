package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        List<Human> children = new ArrayList<>();
        List<Human> children_1 = new ArrayList<>();
        List<Human> children_2 = new ArrayList<>();
        List<Human> child = new ArrayList<>();
        Human sone_1 = new Human("Коля",true,15,child);
        Human sone_2 = new Human("Вася",true,14,child);
        Human doter = new Human("Надя",false,18,child);
        children.add(sone_1);children.add(sone_2);children.add(doter);
        Human father = new Human("Сергей",true,45,children);
        Human mother = new Human("Лена",false,37,children);
        children_1.add(mother);
        children_2.add(father);
        Human grandfather_1 = new Human("Костя",true,65,children_1);
        Human grandfather_2 = new Human("Саша",true,70,children_2);
        Human grandmother_1 = new Human("Инна",false,75,children_1);
        Human grandmother_2 = new Human("Галя",false,85,children_2);

        System.out.println(grandfather_1.toString());
        System.out.println(grandfather_2.toString());
        System.out.println(grandmother_1.toString());
        System.out.println(grandmother_2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(sone_1.toString());
        System.out.println(sone_2.toString());
        System.out.println(doter.toString());



    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children;

        public Human(String name,boolean sex,int age,List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
