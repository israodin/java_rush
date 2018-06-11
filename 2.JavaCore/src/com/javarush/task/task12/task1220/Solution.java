package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }
    public interface Run{ public void canRun(String name);}
    public interface Swim{ public void canSwim(String name);}
    public abstract class Human implements Run,Swim
    {

    }
    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
