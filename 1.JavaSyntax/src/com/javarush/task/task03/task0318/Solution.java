package com.javarush.task.task03.task0318;

/* 
План по захвату мира
Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String name = bufferedReader.readLine();
//        int year = Integer.parseInt(bufferedReader.readLine());
//
//        System.out.println(name.trim()+" захватит мир через "+year+" лет. Му-ха-ха!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Voz = reader.readLine();
        int iVoz = Integer.parseInt(Voz);

        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + iVoz + " лет. Му-ха-ха!");
    }
}
