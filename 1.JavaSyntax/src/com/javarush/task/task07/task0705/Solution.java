package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
        int [] big_array = new  int[20];
        for (int i = 0; i < big_array.length;i++)
        {
            big_array[i] = Integer.parseInt(tr.readLine());
        }

//        int []big_array = {12 ,45 ,78 ,6 ,354 ,45 ,78 ,128 ,459 ,7 ,36 ,25 ,58 ,85 ,564 ,231,321 ,852 ,96,1};

        int [] arr1 = new  int[10];
        int [] arr2 = new  int[10];
        for (int i = 0 ; i < arr1.length;i++)
        {
            arr1[i] = big_array[i];
        }
        for (int i = 0 ; i < arr2.length;i++)
        {
            arr2[i] = big_array[big_array.length/2+i];
        }
        for (int i = 0;i< arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
