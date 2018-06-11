package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fie_name = reader.readLine();
        FileInputStream fis = new FileInputStream(fie_name);
        int max = 0; int item = 0;

        while (fis.available()> 0)
        {
            if((item=fis.read())>max)
            {
                max = item;
            }

        }
        reader.close();
        fis.close();
        System.out.println(max);
    }
}
