package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        FileInputStream fis = new FileInputStream(file_name);
        ArrayList<Byte> list_byte = new ArrayList<>();
        while (fis.available()>0)
        {
            list_byte.add((byte)fis.read());
        }
        int count = 0;
        HashMap<Byte,Integer> map_bytes = new HashMap<>();
        for(int i = 0 ;i < list_byte.size();i++)
        {
            count = Collections.frequency(list_byte,list_byte.get(i));
            map_bytes.put(list_byte.get(i),count);
        }
        if (!map_bytes.isEmpty())
        {
            int max = Collections.max(map_bytes.values());
            for(Map.Entry<Byte,Integer>pair :map_bytes.entrySet())
            {
                if(pair.getValue()==max)
                {
                    System.out.print(pair.getKey()+" ");
                }
            }
        }
        fis.close();
        reader.close();
    }
}
