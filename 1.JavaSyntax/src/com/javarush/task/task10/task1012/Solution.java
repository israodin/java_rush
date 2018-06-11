package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
//        ArrayList<String> list  = new ArrayList<>() ;
//        list.add("ссдссфсф");
//        list.add( "гфгчтчтт");
//        list.add( "сдсфдгг");
//        list.add("дггфгччг");
//        list.add("ггфггфчч");
//        list.add("чччфчыты");
//        list.add("тчтыййй");
//        list.add("чггжччрт");
//        list.add("фттчтчч");
//        list.add("чтчтчтчф");

        // напишите тут ваш код
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0; // Создаем переменную для счета вхождений
            for (int j = 0; j < list.size(); j++) {
                char[] cEqual = list.get(j).toCharArray(); // Преобразовываем j-тую строку в массив
                for (int k = 0; k < cEqual.length; k++) {
                    if (alphabet.get(i) == cEqual[k]) { // Сравниваем k-тый элемент массива с i-тым из алфавита
                        count++; // Считаем вхождения
                    }
                }
            }

//        HashMap<Character,Integer> word_charect = new HashMap<>();
//
//        for(int i = 0;i < abcArray.length;i++)
//        {
//            word_charect.put(abcArray[i],0);
//        }
//        StringBuffer str = new StringBuffer();
//        for(String line : list)
//        {
//            str.append(line);
//        }
//        for(HashMap.Entry<Character,Integer> entry : word_charect.entrySet())
//        {
//            char [] chars = str.toString().toCharArray();
//            for(int i = 0;i < chars.length;i++)
//            {
//                char keys = entry.getKey();
//                int val = entry.getValue();
//                if(chars[i] == keys)
//                {
//                    val ++;
//                    entry.setValue(val);
//                }
//            }
//
//        }
//        for(HashMap.Entry<Character,Integer> entry : word_charect.entrySet())
//        {
//
//                System.out.println(entry.getKey() + " " + entry.getValue());
//
//        }
            System.out.println(alphabet.get(i) + " " + count);  // Выводим на печать
        }

    }

}
