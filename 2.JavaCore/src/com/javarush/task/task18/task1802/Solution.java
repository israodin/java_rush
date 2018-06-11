package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(file_name);
        int min =0;int item = 0;
        if (fis.available()>0)
        {
            min = fis.read();
        }
        while (fis.available()>0)
        {
            if((item = fis.read())<min)
            {
                min = item;
            }
        }
        fis.close();
        System.out.println(min);
    }
}
