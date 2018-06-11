package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String file_name = in.readLine();
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(file_name)));
            while (file.ready())
            {
                System.out.println(file.readLine());
            }


            in.close();
            file.close();

    }
}