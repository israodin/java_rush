package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        String [] arr = num.split("");
        for (int i = 0 ; i < arr.length;i++)
        {
            int number = Integer.parseInt(arr[i]);
            if (number%2==0)
            {
                even ++;
            }else if (number%2 != 0)
            {
                odd++;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
