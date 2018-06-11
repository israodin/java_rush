package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> lists = new ArrayList<int[]>();
        int [] num1  = {3,34,76,12,45};
        lists.add(num1);
        int [] num2  = {3,34};
        lists.add(num2);
        int [] num3  = {3,34,76,45};
        lists.add(num3);
        int [] num4  = {3,34,76,12,45,32,78};
        lists.add(num4);
        int [] num5 = {};
        lists.add(num5);

        return lists;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
