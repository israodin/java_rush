package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int res = 0;
        while (a != -1)
        {
            a = Integer.parseInt(reader.readLine());
            res += a;
        }
        System.out.println(res);
    }
}
