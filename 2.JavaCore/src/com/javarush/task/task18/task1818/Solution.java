package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
//        String file1 = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/data.txt";
//        String file2 = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/file2";
//        String file1 = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1808/file1";
        reader.close();
        FileInputStream  fis2 = new FileInputStream(file2);
        FileInputStream  fis3 = new FileInputStream(file3);
        FileOutputStream fos1  = new FileOutputStream(file1);
        byte [] buffer2 = new byte[fis2.available()];
        byte [] buffer3 = new byte[fis3.available()];
        fis2.read(buffer2);
        fis3.read(buffer3);
        fis2.close();
        fis3.close();

        fos1.write(buffer2);
        fos1.write(buffer3);
        fos1.close();




    }
}
