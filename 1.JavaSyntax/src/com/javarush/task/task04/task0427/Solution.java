package com.javarush.task.task04.task0427;

/* 
Описываем числа
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a_num = Integer.parseInt(a);

        if ((a_num < 1 )|| (a_num > 999))
        {
        }else
            if((a.length()==1) && (parity_check(a_num) == true))
            {
                System.out.println("четное однозначное число");
            }else if((a.length()==1) && (parity_check(a_num) == false))
            {
                System.out.println("нечетное однозначное число");
            }else if ((a.length()==2) && (parity_check(a_num) == true))
            {
                System.out.println("четное двузначное число");
            }else if ((a.length()==2) && (parity_check(a_num) == false))
            {
                System.out.println("нечетное двузначное число");
            }else if ((a.length()==3) && (parity_check(a_num)==true))
            {
                System.out.println("четное трехзначное число");
            }else if ((a.length() ==3) && (parity_check(a_num)==false)) {

                System.out.println("нечетное трехзначное число");

        }
        }

    private static boolean parity_check(int a) {
        boolean checker =  false;
        if (a % 2 ==0) checker = true;
        else checker = false;
        return checker;
    }

}


