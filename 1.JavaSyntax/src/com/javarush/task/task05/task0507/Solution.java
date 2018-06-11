package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a,res = 0,pointer = 0;
        while (flag)
        {
            a = Double.parseDouble(reader.readLine());
            if(a !=-1)
            {
               res += a;
               pointer ++;
               continue;
            }
            flag = false;
        }
        System.out.println(res/pointer);
    }
}

