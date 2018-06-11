package com.javarush.task.task03.task0322;


/* 
Большая и чистая
Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader resder = new BufferedReader(new InputStreamReader(System.in));
        String name1 = resder.readLine();
        String name2 = resder.readLine();
        String name3 = resder.readLine();
        System.out.println(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }
}