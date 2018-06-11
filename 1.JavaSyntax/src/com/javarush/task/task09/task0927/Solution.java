package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> cats = new HashMap<>();
        cats.put("Cat1",new Cat("Cat1"));
        cats.put("Cat2",new Cat("Cat2"));
        cats.put("Cat3",new Cat("Cat3"));
        cats.put("Cat4",new Cat("Cat4"));
        cats.put("Cat5",new Cat("Cat5"));
        cats.put("Cat6",new Cat("Cat6"));
        cats.put("Cat7",new Cat("Cat7"));
        cats.put("Cat8",new Cat("Cat8"));
        cats.put("Cat9",new Cat("Cat9"));
        cats.put("Cat10",new Cat("Cat10"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        for(Map.Entry<String,Cat> entry : map.entrySet())
        {
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
