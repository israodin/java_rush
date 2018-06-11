package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> string = new ArrayList<String>();
        string.add("мама");
        string.add("мыла");
        string.add("раму");
        for (int i = 0 ; i < string.size();i++)
        {
            string.add(i+1,"именно");
            i++;
        }
        for (int i = 0 ; i < string.size();i++)
        {
            System.out.println(string.get(i));
        }

    }
}
