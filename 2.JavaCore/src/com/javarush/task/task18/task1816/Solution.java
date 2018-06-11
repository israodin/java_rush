package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {
    public static void main(String[] args) throws IOException {
        String file_name = args[0];
//      String file_name = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/data.txt";
        FileInputStream fis = new FileInputStream(file_name);
        byte [] buffer = new byte[fis.available()];
        fis.read(buffer,0,fis.available());
        fis.close();
        int count = 0;
        for (int i = 0 ; i <= buffer.length-1;i++)
        {
            char charecter = (char)buffer[i];
            String s = Character.toString(charecter);
            Pattern p = Pattern.compile("^[A-Za-z]+$");
            Matcher m = p.matcher(s);
            if(m.matches())
            {
               count++;
            }
        }
        System.out.println(count);
    }
}
