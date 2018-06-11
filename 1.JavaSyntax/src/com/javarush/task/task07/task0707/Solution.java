package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> listS = new ArrayList<String>();
        listS.add("Roma");
        listS.add("Vasya");
        listS.add("Kolya");
        listS.add("Petya");
        listS.add("Jorik");

        System.out.println(listS.size());
        for (int i = 0;i < listS.size();i++)
        {
            System.out.println(listS.get(i));
        }
    }
}
