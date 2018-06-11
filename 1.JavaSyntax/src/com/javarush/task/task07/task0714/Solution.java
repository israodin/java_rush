package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int f = 0;
        while(f < 5)
        {
            strings.add(in.readLine());
            f++;
        }
        strings.remove(2);
        for (int i = strings.size()-1;i >= 0;i--)
        {
            System.out.println(strings.get(i));
        }

    }
}


