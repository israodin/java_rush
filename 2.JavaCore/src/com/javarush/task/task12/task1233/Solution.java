package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        //напишите тут ваш код
        for(int i = 0;i < array.length;i++)
        {
            map.put(i,array[i]);
        }
        int tmp ;
        for(int i = 0; i < array.length-1;i++)
        {
            for(int j = 0; j < array.length-1;j++)
            {
                if(array[j] > array[j+1] )
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =tmp;
                }
            }

        }
        int x = array[0];
        int index = 0;
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();


        for (Map.Entry<Integer,Integer> pair : entrySet) {
            if (x==(pair.getValue())) {
                 index = pair.getKey();// нашли наше значение и возвращаем  ключ
            }
        }
        return new Pair<Integer, Integer>(x, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
