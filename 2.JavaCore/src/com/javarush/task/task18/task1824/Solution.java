package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String filename = reader.readLine();
            try {
                FileInputStream fis = new FileInputStream(filename);
                fis.close();
            }catch (FileNotFoundException f)
            {
                System.out.println(filename);
                break;
            }


        }
    }


}
