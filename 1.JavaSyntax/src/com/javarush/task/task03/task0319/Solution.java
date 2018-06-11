package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffered = new BufferedReader(new InputStreamReader (System.in));
        String name = buffered.readLine();
        String s_salary = buffered.readLine();
        String s_year = buffered.readLine();
        int salary = Integer.parseInt(s_salary);
        int yaer = Integer.parseInt(s_year);

        System.out.println(name+" получает "+salary+" через "+yaer+" лет.");
    }
}
