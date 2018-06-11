package com.javarush.task.task08.task0818;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> employe = new HashMap<>();
        employe.put("Иванов",1000);
        employe.put("Сидоров",100);
        employe.put("Авас",400);
        employe.put("Моргунов",2000);
        employe.put("Козлов",450);
        employe.put("Андропов",700);
        employe.put("Я",200);
        employe.put("Ты",150);
        employe.put("Он",4900);
        employe.put("Она",430);

        return employe;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Integer> pair = iterator.next();
            Integer salary = pair.getValue();
            if(salary < 500)
            {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = createMap();
        removeItemFromMap(map);
    }
}