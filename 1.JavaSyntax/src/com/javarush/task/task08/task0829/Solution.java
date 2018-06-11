package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses

        Map<String,String> dict  = new HashMap<>();
        boolean flag = true;
        while (flag) {
            String city = reader.readLine();

            if ((city.isEmpty())){
                flag = false;
                break;
            }
            String family = reader.readLine();
            dict.put(city,family);
        }


        Iterator<Map.Entry<String, String>> iterator = dict.entrySet().iterator();
        //read city name
        String pattern = reader.readLine();
        while (iterator.hasNext())
        {
            Map.Entry<String,String> pair  = iterator.next();
            String city = pair.getKey();
            if(city.equals(pattern))
            {
                System.out.println(pair.getValue());
            }
        }

    }
}
