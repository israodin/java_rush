package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] num_array = new  int[20];
        for (int i = 0 ;i < num_array.length;i++)
        {
            num_array[i] = Integer.parseInt(reader.readLine());
        }
//        int []num_array = {12 ,45 ,78 ,6 ,354 ,45 ,78 ,128 ,459 ,7 ,36 ,25 ,58 ,85 ,564 ,231,321 ,852 ,96,1};
        return num_array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int tmp = 0;
        for (int i = 0 ; i <= array.length;i++)
        {
            for (int j = 0 ; j < array.length;j++)
            {
                if(j != array.length-1)
                {
                    if (array[j] < array[j+1] )
                    {
                        tmp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
        return array[0];
    }
}
