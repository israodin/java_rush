package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in  =  new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int p = 0; p < 10;p++)
        {
            strings.add(0,in.readLine());
        }
        for (int i = 0 ; i < strings.size();i++)
        {
            System.out.println(strings.get(i));
        }
    }
}
