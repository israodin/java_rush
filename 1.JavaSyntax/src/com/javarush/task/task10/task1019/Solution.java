package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        boolean flag = true;
        int id = 0;
        String name = null;
        while (flag) {

            String number = reader.readLine();
            if(number.isEmpty())
            {
                flag = false;
                continue;
            }
            name = reader.readLine();
            if(name.isEmpty() )
            {
                flag = false;
                continue;
            }

            id = Integer.parseInt(number);
            map.put(name,id);
        }


        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            id = entry.getValue();
            name = entry.getKey();
            System.out.println(id + " " + name);
        }

    }
}
