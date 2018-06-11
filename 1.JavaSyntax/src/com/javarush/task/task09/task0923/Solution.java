package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
//        String line = "мама мыла раму";
        List<String> consonants = new ArrayList<>();
        List<String> vowel = new ArrayList<>();
        char [] literals = line.toCharArray();
        for(int i = 0 ; i < literals.length;i++)
        {
            String tmp = String.valueOf(literals[i]);
            if(isVowel(literals[i]))
            {
                vowel.add(tmp);
                continue;

            }
            if(tmp.equals(" "))
            {
                continue;
            }
            consonants.add(tmp);
        }
        for(String str : vowel)
        {
            System.out.print(str+" ");
        }
        System.out.println();
        for(String str : consonants)
        {
            System.out.print(str+" ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}