package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;int j = 1;
        while (i <= 10 )
        {
            while (j<=10)
            {
                int res = i*j;
                System.out.print(res);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
            j = 1 ;
        }
    }
}
