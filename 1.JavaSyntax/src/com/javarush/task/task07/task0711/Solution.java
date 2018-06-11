package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> strings = new ArrayList<String>();
        int y = 0 ;
        while (y < 5)
        {
            strings.add(in.readLine());
            y++;
        }
        for(int p = 0; p < 13;p++)
        {
            String line = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,line);
        }
        for (int j = 0;j < strings.size();j++)
        {
            System.out.println(strings.get(j));
        }

    }
}
