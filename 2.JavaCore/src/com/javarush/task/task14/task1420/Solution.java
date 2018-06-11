package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (x <= 0 || y <= 0) { throw new IllegalArgumentException("Numbers are not positive"); }
            while (y !=0) {
                int tmp = x%y;
                x = y;
                y = tmp;
            }
            System.out.println(x);


    }
}
