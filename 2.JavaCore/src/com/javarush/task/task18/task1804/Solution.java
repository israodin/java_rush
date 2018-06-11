package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reeader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reeader.readLine();
        FileInputStream fis = new FileInputStream(file_name);
        ArrayList<Byte> list_byrte = new ArrayList<>();
        while (fis.available()>0)
        {
            list_byrte.add((byte)fis.read());
        }
        int count = 0;
        HashMap<Byte,Integer> map_bytes = new HashMap<>();
        for(int i = 0 ;i < list_byrte.size();i++)
        {
            count = Collections.frequency(list_byrte,list_byrte.get(i));
            map_bytes.put(list_byrte.get(i),count);
        }
        if(!map_bytes.isEmpty())
        {
            int min = Collections.min(map_bytes.values());
            for(Map.Entry<Byte,Integer>pair : map_bytes.entrySet())
            {
                if (pair.getValue()==min)
                {
                    System.out.print(pair.getKey()+" ");
                }
            }
        }
        reeader.close();
        fis.close();

    }
}
