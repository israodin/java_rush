package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[3];
        int c = 0,b=0;
        for (int i = 0 ; i < arr.length;i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
            if(arr[i]==0){}
            else if (arr[i] > 0) {
                c++;
            }else
            {
                b++;
            }
        }
        System.out.println("количество отрицательных чисел: "+b);
        System.out.println("количество положительных чисел: "+c);
    }
}
