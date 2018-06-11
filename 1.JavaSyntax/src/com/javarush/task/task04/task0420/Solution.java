package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[3];
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int tmp = 0;
        for(int i = 0 ; i < arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-1;j++ )
            {
                if (arr[j] < arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i = 0 ; i<arr.length;i++)
        {
            System.out.println(arr[i]);
    }
    }
}
