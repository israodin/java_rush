package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String word = "none";
        int res = 0;
        boolean flag = true;
        while(flag)
        {
            word = reader.readLine();
            if(word.equals("сумма")){
                flag = false;
                continue;
            }
            int a = Integer.parseInt(word);
            res = res+a;
        }
        System.out.println(res);
    }
}
