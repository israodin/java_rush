package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> [] list = new ArrayList[5];
        ArrayList<String> list0 = new ArrayList<>();
        list0.add("fkdfkdlf");list0.add("fkdwfkdlf");list0.add("fkdfdfskdlf");list0.add("fkdwdwfkdlf");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("fkdfkdlf");list1.add("fkdwfkdlf");list1.add("fkdfdfskdlf");list1.add("fkdwdwfkdlf");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("fkdfkdlf");list2.add("fkdwfkdlf");list2.add("fkdfdfskdlf");list2.add("fkdwdwfkdlf");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("fkdfkdlf");list3.add("fkdwfkdlf");list3.add("fkdfdfskdlf");list3.add("fkdwdwfkdlf");
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("fkdfkdlf");list4.add("fkdwfkdlf");list4.add("fkdfdfskdlf");list4.add("fkdwdwfkdlf");
        list[0] = list0;list[1] = list1;list[2] = list2;list[3] = list3;list[4] = list4;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}