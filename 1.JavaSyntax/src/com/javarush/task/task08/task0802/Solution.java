package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String,String> eda = new HashMap<String,String>();
        eda.put("арбуз","ягода");
        eda.put("банан","трава");
        eda.put("вишня","ягода");
        eda.put("груша","фрукт");
        eda.put("дыня","овощ");
        eda.put("ежевика","куст");
        eda.put("жень-шень","корень");
        eda.put("земляника","ягода");
        eda.put("ирис","цветок");
        eda.put("картофель","клубень");

        for(Map.Entry<String,String> pair : eda.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" - "+value);
        }

    }
}
