package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
//       String [] array = {"dsdsd","trtrtrt","tyujy","sdsds","eerr","gggjg","rerer","asasas","fgfhf","uuuu","sdsd","retetr","cxcdd","wewewe","asasaa","ghght","rtrrtr","qsqwqw","dddfd","kklk"};
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String tmp;
        for(int i = 0; i < array.length-1;i++)
        {
            for(int j = 0;j < array.length-1;j++)
            {
                if(isGreaterThan(array[j],array[j+1]))
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=tmp;
                }
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

