package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

//
//       String file1 = "E:\\Dropbox\\Workspaces\\JavaRush\\jr_for_beginner\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\file2";
//       String file2 = "E:\\Dropbox\\Workspaces\\JavaRush\\jr_for_beginner\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\file1";
        reader.close();

        FileInputStream fis1 = new FileInputStream(file1);
        byte [] buffer_file1 = new byte[fis1.available()];
        fis1.read(buffer_file1);
        fis1.close();
        FileInputStream fis2 = new FileInputStream(file2);
        byte [] buffer_file2 = new byte[fis2.available()];
        fis2.read(buffer_file2);
        fis2.close();

        FileOutputStream fos = new FileOutputStream(file1);
        fos.write(buffer_file2);
        fos.close();

        fos = new FileOutputStream(file1,true);
        fos.write(buffer_file1);
//        fos.write(buffer_file1);
        fos.close();

    }
}
