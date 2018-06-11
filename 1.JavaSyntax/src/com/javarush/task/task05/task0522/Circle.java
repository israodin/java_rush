package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){}
    public Circle(double x,double y,double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x,double radius)
    {
        this.x = x;
        this.y = x;
        this.radius = radius;
    }
    public Circle(Circle another_circle)
    {
        this.x = another_circle.x;
        this.y = another_circle.y;
        this.radius = another_circle.radius;
    }
    public static void main(String[] args) {

    }
}