package com.javarush.task.task08.task0814;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(45);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);
        numbers.add(4);
        numbers.add(10);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(14);
        numbers.add(3);
        numbers.add(30);
        numbers.add(20);
        numbers.add(25);
        numbers.add(12);
        numbers.add(2);
        numbers.add(7);
        numbers.add(17);
        numbers.add(66);
        numbers.add(78);
        return numbers;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        Iterator<Integer> iter = set.iterator();

        while(iter.hasNext()){
            Integer next = iter.next();
            if(next > 10)
                iter.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
    }
}
