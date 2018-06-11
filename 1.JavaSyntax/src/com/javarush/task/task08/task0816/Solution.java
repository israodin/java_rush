package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Vandam", new Date("AUGUST 10 1980"));
        map.put("Shvarzneger", new Date("SEPTEMBER 11 1985"));
        map.put("Kerri", new Date("MAY 13 1980"));
        map.put("Allen", new Date("MARCH 14 1970"));
        map.put("Anderson", new Date("FEBRUARY 18 1980"));
        map.put("Bob", new Date("JULY 15 1980"));
        map.put("Obama", new Date("OCTOBER 16 1980"));
        map.put("Klinton", new Date("NOVEMBER 11 1980"));
        map.put("Bush", new Date("MAY 16 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();



        while (iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date my_date = pair.getValue();
            Calendar cal = Calendar.getInstance();
            cal.setTime(my_date);
            int month = cal.get(Calendar.MONTH);


            if((month > 4) && (month < 8))
            {
               iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String,Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
