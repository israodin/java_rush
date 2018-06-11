package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    //напишите тут ваш код
    String name ;
    int weight;
    int age;
    String color;
    String address;

    public void  initialize(String name)
    {
        this.name = name;
        this.weight =2;
        this.age = 3;
        this.color = "color";


    }
    public void initialize(String name,int weight,int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";

    }
    public void initialize(String name,int age)
    {
        this.name = name;
        this.weight = 2;
        this.age = age;
        this.color = "not";

    }
    public void initialize(int weight,String color)
    {
        this.color = color;
        this.weight = weight;
        this.age = 3;


    }
    public void initialize(int weight,String color,String address)
    {
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = 6;
    }
    public static void main(String[] args) {

    }
}
