package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        FileInputStream fis = new FileInputStream(file_name);
        byte [] buffer = new byte[fis.available()];
        fis.read(buffer,0,fis.available());
        int count = 0;
        for(int i = 0;i < buffer.length;i++)
        {
            char charecter = (char)buffer[i];
            int asci = (int)charecter;
            if (asci==(int)',')
            {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        fis.close();

    }
}
