package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();cats.add(cat1);
        Cat cat2 = new Cat();cats.add(cat2);
        Cat cat3 = new Cat();cats.add(cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

    // step 1 - пункт 1
    public  static class Cat{

    }
}
