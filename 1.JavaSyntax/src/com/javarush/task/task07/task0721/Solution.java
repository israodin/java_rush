package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int [] numbers = new int[20];
        int tmp = 0;
        //напишите тут ваш код
        for (int i = 0 ; i < numbers.length;i++)
        {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0 ; i< numbers.length;i++)
        {
            for(int j = 0 ; j < numbers.length-1;j++)
            {
                if(numbers[j] > numbers[j+1])
                {
                    tmp = numbers[j];
                    numbers[j] = numbers [j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        maximum = numbers[numbers.length-1];
        minimum = numbers[0];
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
