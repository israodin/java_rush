package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int tmp = 0;
        for (int i = 0;i < array.size();i++)
        {
            for (int j = 0 ;j < array.size()-1;j++)
            {
                if(array.get(j) > array.get(j + 1))
                {

                    tmp = array.get(j);
                    array.remove(j);
                    array.add(j,array.get(j));
                    array.remove(j+1);
                    array.add(j+1,tmp);
                }
            }
        }

        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine());
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i < number;i++)
        {
            numbers.add(Integer.parseInt(in.readLine()));
        }
        return numbers;
    }

}
