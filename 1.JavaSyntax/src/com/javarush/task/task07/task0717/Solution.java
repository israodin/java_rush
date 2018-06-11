package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int i = 0;
        while (i < 10 )
        {
            list.add(in.readLine());
            i++;
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i =  0 ; i < list.size();i++)
        {
            list.add(i+1,list.get(i));
            i++;
        }
        return list;

    }
}
