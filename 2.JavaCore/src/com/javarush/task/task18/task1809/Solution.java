package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(file1);
        byte [] buffer = new byte[fis.available()];
        fis.read(buffer,0,fis.available());

        FileOutputStream fos = new FileOutputStream(file2);
        for(int i = buffer.length-1;i >= 0;i--)
        {
            fos.write(buffer[i]);
        }
        fis.close();
        fos.close();
    }
}
