package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[3];
        int tmp = 0;
        for (int i = 0;i<arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0;i <arr.length-1;i++)
        {
            for (int j = 0 ; j < arr.length-1; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
