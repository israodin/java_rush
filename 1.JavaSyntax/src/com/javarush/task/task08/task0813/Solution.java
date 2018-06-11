package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet words = new HashSet<String>();
        words.add("Лимон");
        words.add("Ластик");
        words.add("Лазер");
        words.add("Лактоза");
        words.add("Лоза");
        words.add("Лира");
        words.add("Лак");
        words.add("Лама");
        words.add("Лампа");
        words.add("Лимфа");
        words.add("Лимур");
        words.add("Лава");
        words.add("Лоно");
        words.add("Луна");
        words.add("Люстра");
        words.add("Лифт");
        words.add("Люфт");
        words.add("Лик");
        words.add("Липа");
        words.add("Лиса");

        return words;
    }

    public static void main(String[] args) {
        HashSet <String> word = createSet();

    }
}
