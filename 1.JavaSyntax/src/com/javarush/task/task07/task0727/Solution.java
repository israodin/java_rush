package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        ArrayList <String> lines = new ArrayList<String>();
        for (int i = 0; i < list.size();i++)
        {
           String line = list.get(i);
           if(line.length() % 2 == 0 )
           {
               line = line + " "+line;
               list.add(i,line);
               list.remove(i+1);
           }else if (line.length() % 2 != 0 )
           {
               line = line+ " "+line+" "+line;
               list.add(i,line);
               list.remove(i+1);
           }

        }
        for (String s : list)
        {
            System.out.println(s);
        }
//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listUpperCase.size(); i++) {
//            System.out.println(listUpperCase.get(i));
//        }
    }
}
