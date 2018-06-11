package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[5];
        int i = 0;
        while(i < 5)
        {
            String line = in.readLine();
            strings.add(line);
            numbers[i] = line.length();
            i++;
        }
        int tmp = 0;
        for(int x = 0; x < numbers.length;x++)
        {
            for (int y = 0;y <numbers.length;y++)
            {
                if(y < numbers.length-1)
                {
                    if(numbers[y] > numbers[y+1])
                    {
                        String r1 = strings.get(y);
                        String r2 = strings.get(y+1);
                        tmp = numbers[y];
                        numbers[y] = numbers[y+1];
                        strings.remove(y);
                        strings.add(y,r2);
                        numbers[y+1] = tmp;
                        strings.remove(y+1);
                        strings.add(y+1,r1);
                    }
                }continue;

            }
        }
        System.out.println(strings.get(0));
        for(int j = 1;j < numbers.length;j++)
        {
            if(numbers[j] <= numbers[0])
            {
                System.out.println(strings.get(j));
            }
        }
    }
}
