package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        int tmp = 0;
        //напишите тут ваш код
        for (int i = 0 ; i < arr.length;i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0 ;i < arr.length-1;i++)
        {
            for(int j = 0 ;j < arr.length-1;j++ )
            {
                if (arr[j] > arr[j+1])
                {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
