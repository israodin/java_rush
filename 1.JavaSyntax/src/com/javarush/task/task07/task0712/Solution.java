package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int [] tmp = new int[10];
        int i = 0;
        while (i < 10)
        {
            String line =  in.readLine();
            strings.add(line);
            tmp[i] = line.length();
            i++;
        }
        int minVal = tmp[0];
        int maxVal = tmp[0];
        for (int b = 1; b < tmp.length; b++)
            {
                if (tmp[b] > maxVal)
                    maxVal = tmp[b];
            }
        for (int b = 1; b < tmp.length; b++)
        {
            if (tmp[b] < minVal)
                minVal = tmp[b];
        }
//        System.out.println(maxVal+" "+minVal);
        for(int j = 0; j < tmp.length;j++)
        {
            if(tmp[j] == minVal)
            {
                System.out.println(strings.get(j));
                return;
            }
            else if(tmp[j] == maxVal)
            {
                System.out.println(strings.get(j));
                return;
            }
        }



    }
}
