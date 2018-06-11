package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        String str = op.readLine();
        return str;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(op.readLine());
        return num;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(op.readLine());
        return num;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        boolean boo = Boolean.parseBoolean(op.readLine());
        return boo;
    }

    public static void main(String[] args) {

    }
}
