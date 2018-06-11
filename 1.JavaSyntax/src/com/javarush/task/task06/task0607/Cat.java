package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //напишите тут ваш код
        return catCount;

    }

    public static void setCatCount(int catCount) {
        //напишите тут ваш код
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
