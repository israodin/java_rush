package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer;
        boolean flag = true;
        try {
            String file_name = reader.readLine();
            writer = new BufferedWriter(new FileWriter(file_name));
            while(flag)
            {
                String line = reader.readLine();
                if (line.equals("exit"))
                {
                    writer.write(line);
                    flag=false;
                }else
                {
                    line = line+"\n";
                    writer.write(line);
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
