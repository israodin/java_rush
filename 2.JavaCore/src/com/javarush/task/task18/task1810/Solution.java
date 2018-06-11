package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag)
        {
            String filename = reader.readLine();
            FileInputStream fis = new FileInputStream(filename);
            if(fis.available()<1000)
            {
                fis.close();
                flag=false;
                throw new DownloadException();
            }
            fis.close();
        }
        reader.close();


    }

    public static class DownloadException extends Exception {

    }
}
