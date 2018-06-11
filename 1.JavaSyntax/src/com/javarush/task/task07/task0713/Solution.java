package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution{

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> primary_num = new ArrayList<Integer>();
        ArrayList<Integer> num_3 = new ArrayList<Integer>();
        ArrayList<Integer> num_2 = new ArrayList<Integer>();
        ArrayList<Integer> num_0 = new ArrayList<Integer>();
        int x = 0;
        while (x < 20) {
            primary_num.add(Integer.parseInt(in.readLine()));
            x++;
        }
//        primary_num = {12, 45, 85, 7, 65, 2, 8, 2, 4, 68, 12, 78, 82, 64, 28, 8, 10, 9, 3, 5};
        for (int y = 0 ; y < primary_num.size();y++) {
            int num = primary_num.get(y);
            if ((num % 2 == 0) && (num % 3 == 0)) {
                num_3.add(num);
                num_2.add(num);
            } else if (num % 3 == 0) {
                num_3.add(num);
            } else if (num % 2 == 0) {
                num_2.add(num);
            } else if ((num % 2 != 0) && (num % 3 != 0)) {
                num_0.add(num);
            }
        }
        printList(num_3);
        printList(num_2);
        printList(num_0);

        
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(Integer number : list )
        {
            System.out.println(number);
        }
    }
}
