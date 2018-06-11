package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
//        int [] array1 = {12 ,56 ,34 ,89 ,23 ,45 ,67 ,87 ,5 ,28, 95 ,234, 123, 567, 32, 789, 213,764 ,9,3};
        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int tmp = 0;
        for(int i = 0 ; i < array.length-1;i++)
        {
            for (int j = 0;j < array.length-1;j++)
            {
                if(array[j]< array[j+1])
                {
                    tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1] =tmp;
                }
            }
        }
    }
}
