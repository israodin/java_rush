package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        return this.strength*this.weight > anotherCat.weight*anotherCat.strength;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Семен", 5,15, 12);
        Cat cat2 = new Cat("Мурзик", 7, 10, 15);
        cat1.fight(cat2);
    }
}
