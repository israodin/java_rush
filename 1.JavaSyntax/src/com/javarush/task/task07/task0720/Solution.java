package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> lines = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int i = 0;
        String tmp = null;
        while(i  < n)
        {
            lines.add(reader.readLine());
            i++;
        }
        int pointer = 0;
        for(int j = 0 ; j < lines.size();j++)
        {
            if (pointer < m)
            {
                lines.add(lines.get(j));
                lines.remove(j);
                j--;
                pointer++;
            }
        }
        for(String str : lines)
        {
            System.out.println(str);
        }

    }
}
