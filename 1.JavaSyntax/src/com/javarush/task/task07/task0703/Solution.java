package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] str_arr = new  String[10];
        int [] num_array = new  int[10];
        for (int i = 0 ; i < str_arr.length;i++)
        {
            String line = reader.readLine();
            str_arr[i] = line;
            num_array[i] = line.length();
        }
        for (int i = 0 ; i < num_array.length;i++)
        {
            System.out.println(num_array[i]);
        }
    }
}
