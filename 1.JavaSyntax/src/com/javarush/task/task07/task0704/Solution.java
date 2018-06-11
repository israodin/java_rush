package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int [] ar = new  int[10];
        for (int  i = 0 ; i < ar.length;i++)
        {
            ar[i] = Integer.parseInt(re.readLine());
        }
        for (int i = ar.length-1;i >= 0 ;i--)
        {
            System.out.println(ar[i]);
        }
    }
}

