package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> people = new HashMap<>();
        people.put("Иванов","Ваня");
        people.put("Петров","Ваня");
        people.put("Сидоров","Петя");
        people.put("Орлов","Ваня");
        people.put("Соколов","Коля");
        people.put("Сидоров","Петя");
        people.put("Полищук","Коля");
        people.put("Антонов","Сергей");
        people.put("Козлов","Ваня");
        people.put("Королёв","Петя");
        people.put("Король","Петя");
        return people;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,String> pair = iterator.next();
            String this_name = pair.getValue();
            if(this_name.equals(name))
            {
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,String> pair = iterator.next();
            String this_lastName = pair.getKey();
            if (this_lastName.equals(lastName))
            {
                count++;
            }
        }
        return count++;
    }

    public static void main(String[] args) {
        HashMap<String,String> map = createMap();
        int count = getCountTheSameFirstName(map,"Ваня");
        count = getCountTheSameLastName(map,"Сидоров");
    }
}
