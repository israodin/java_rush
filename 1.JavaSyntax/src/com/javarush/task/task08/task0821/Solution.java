package com.javarush.task.task08.task0821;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> mens = new HashMap<String, String>();
        mens.put ("Петров","Сергей");
        mens.put ("Андреев","Сергей");
        mens.put ("Петров","Андрей");
        mens.put ("Сидоров","Василий");
        mens.put ("Васерман","Сидор");
        mens.put ("Николаев","Пётр");
        mens.put ("Петров","Николай");
        mens.put ("Антонов","Антон");
        mens.put ("Василёк","Николай");
        mens.put ("Ант","Пётр");

        return mens;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }



}
