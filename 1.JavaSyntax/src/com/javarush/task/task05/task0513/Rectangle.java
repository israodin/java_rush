package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top,left,width,height;

    public void initialize(int top,int left,int width,int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(Rectangle another_rech)
    {
        this.top = another_rech.top;
        this.left = another_rech.left;
        this.width = another_rech.width;
        this.height =another_rech.height;
    }
    public void initialize(int top,int left)
    {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int top,int left,int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public static void main(String[] args) {

    }
}
