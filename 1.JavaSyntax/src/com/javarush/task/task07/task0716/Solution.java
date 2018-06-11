package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        int size = list.size();
        for(int i =0 ;i <= list.size()-1;i++)
        {
            String line  = list.get(i);

            if ((line.contains("р")) && (line.contains("л")))
            {
                continue;
            } else if(line.contains("р"))
            {
                list.remove(i);
                i --;


            }else if (line.contains("л"))
            {
                list.add(i+1,line);
                i++;
            }


        }

        return list;
    }
}