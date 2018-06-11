package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        //напишите тут ваш код
        for(int i = 0 ; i < 4;i++)
        {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> results = new HashSet<>();
        for(int i = 0 ; i < 3;i++)
        {
            results.add(new Dog());
        }
        return results;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<>(cats);
        Iterator<Dog> iterator = dogs.iterator();

        while (iterator.hasNext())
        {
            Dog dog = iterator.next();
            pets.add(dog);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        Iterator<Cat> iterator_cat = cats.iterator();
        while (iterator_cat.hasNext())
        {
            Cat cat = iterator_cat.next();
            for (Object j : cats)
            {
//                Object obj = iterator.next();
                if(j.equals(cat))
                {
                    pets.remove(j);
                    break;
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}
