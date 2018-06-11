package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int [] num_people = new int[15];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0 ; i < num_people.length;i++)
        {
            num_people[i] = Integer.parseInt(re.readLine());
        }
        for (int i = 0 ; i < num_people.length;i++)
        {
            if (i %2 == 0 )
            {
                count1 = count1 + num_people[i];
            }else if (i % 2 != 0 )
            {
                count2 = count2+num_people[i];
            }
        }
        if(count1 > count2)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else
        {
           System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
