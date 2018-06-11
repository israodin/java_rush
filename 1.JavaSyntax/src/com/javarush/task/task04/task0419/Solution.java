package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
//        if ((max(a,b))< (max(c,d)))
//        {
//            System.out.println(max(a,b));
//        }else if((max(a,b))<(max(c,d)))
//        {
//            System.out.println(max(c,d));
//        }else if((max(a,b))==(max(c,d)))
//        {
//            System.out.println(max(a,b));
//        }
//
//    }
//    public static int max(int x ,int y)
//    {
//        if (x == y )
//        {
//            return x;
//        }
//        if (x > y)
//        {
//            return x;
//        }else
//        {
//            return y;
//        }
                int [] arr = new int[4];
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int tmp = 0;
        for(int i = 0 ; i < arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-1;j++ )
            {
                if (arr[j] > arr[j+1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
