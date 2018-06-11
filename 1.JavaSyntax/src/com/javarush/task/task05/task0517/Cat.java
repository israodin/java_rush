package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name)
    {
        this.name = name;
        this.age = 12;
        this.weight = 3;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age =13;

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 14;
    }

    public static void main(String[] args) {

    }
}
