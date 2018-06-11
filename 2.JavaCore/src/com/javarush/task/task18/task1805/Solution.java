package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        reader.close();
        ArrayList<Byte> byte_list = new ArrayList<>();
        FileInputStream fis =new FileInputStream(file_name);
        while (fis.available()>0)
        {
            byte_list.add((byte)fis.read());
        }
        fis.close();
        Set<Byte> set_byte = new HashSet<>();
        set_byte.addAll(byte_list);
        Object[] array_list=set_byte.toArray();
        byte tmp = 0;
        for(int i = 0 ; i < array_list.length;i++)
        {
            for (int y = 0 ; y<array_list.length-1;y++)
            {
                byte y1 = (byte)array_list[y];
                byte y2 = (byte)array_list[y+1];
                if (y1 > y2)
                {
                    tmp = (byte)array_list[y+1];
                    array_list[y+1]=array_list[y];
                    array_list[y] = tmp;
                }
            }
        }
        for(int i = 0 ; i < array_list.length;i++)
        {
            System.out.print(array_list[i]+" ");
        }

    }
}
