package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        String [] str_array = new String[10];
        for (int i = 0 ; i < str_array.length-2 ; i++)
        {
            str_array[i] = re.readLine();
        }
        for (int i = str_array.length-1;i>= 0;i--)
        {
            System.out.println(str_array[i]);
        }
    }
}