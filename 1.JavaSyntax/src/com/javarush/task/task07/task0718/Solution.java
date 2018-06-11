package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<String>();
        int size = 10;
        int i = 0;
        int [] sizes = new int [size];
        while(i < size)
        {
            String line  = in.readLine();
            list.add(line);
//            sizes[i] = line.length();
            i++;
        }
        for (int j = 0 ; j < list.size()-1;j++)
        {
            int j1 = list.get(j).length();
            int j2 = list.get(j+1).length();
            if (j1 > j2)
            {
                System.out.println(j+1);
                return;
            }
        }

    }
}

