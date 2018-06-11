package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String res = "";
        String [] lines = s.split(" ");
        for(int i = 0 ; i < lines.length;i++)
        {
            String text = lines[i];
            if(text.isEmpty())
            {
                res =res + text ;
            }else {
                text = text.substring(0, 1).toUpperCase() + text.substring(1);
                res = res + text;
            }
            if (i != lines.length-1)
            {
                res = res +" ";
            }
        }
        System.out.println(res);
    }
}
