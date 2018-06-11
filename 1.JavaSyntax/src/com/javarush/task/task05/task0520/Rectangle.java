package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top,left,width,height;

    public Rectangle(int top,int left,int width,int height)
    {
        this.top = top;
        this.left = left;
        this.width =width;
        this.height =height;
    }
    public Rectangle(int top , int left)
    {
        this.top = top;
        this.left = left;
        this.width= 0;
        this.height = 0;
    }
    public Rectangle(int top,int left,int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle another_rech)
    {
        this.top = another_rech.top;
        this.left = another_rech.left;
        this.width = another_rech.width;
        this.height = another_rech.height;
    }
    public static void main(String[] args) {

    }
}
