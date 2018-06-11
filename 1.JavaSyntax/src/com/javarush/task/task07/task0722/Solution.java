package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> lines = new ArrayList<String>();
        String line = null;
        boolean flag = true;
        while(flag == true)
        {
            line = reader.readLine();
            if (line.equals("end"))
            {
                flag = false;
                continue;
            }
            lines.add(line);
        }
        for(String s : lines)
        {
            System.out.println(s);
        }
    }
}