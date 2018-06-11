package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
      String file_name = args[0];
//     String file_name = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/data.txt";
        FileInputStream fis =  new FileInputStream(file_name);
        byte [] buffer = new byte[fis.available()];
        fis.read(buffer,0,fis.available());
        fis.close();
        int number_sunbols = buffer.length-1;
        int number_spaces = 0;
        for (int i = 0 ;i < buffer.length;i++)
        {
            char symbol= (char)buffer[i];
            if (symbol == ' ')
            {
                number_spaces++;
            }
        }
        double k = (double) number_spaces/number_spaces * 100;
        System.out.printf("%.2f", k);



    }
}
