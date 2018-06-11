package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file_name =  args[0];

 //       String file_name = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1821/file2";

        FileInputStream fis = new FileInputStream(file_name);
        byte [] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
//        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map_ansi = new HashMap<>();
        for(int i = 0 ; i < buffer.length;i++)
        {
            char key = (char)buffer[i];
            int ansi_key = (int)key;
            if(map_ansi.containsKey(ansi_key))
            {
                int value = map_ansi.get(ansi_key);
                value++;

//                map.put(key,value);
                map_ansi.put(ansi_key,value);
            }else
            {
//                map.put(key,1);
                map_ansi.put(ansi_key,1);
            }
        }
        Map<Integer,Integer> treeMap = new TreeMap<Integer, Integer>(map_ansi);
        Iterator<Map.Entry<Integer, Integer>> entries = treeMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            int k = entry.getKey();
            char ansi_k = (char)k;
            System.out.println(ansi_k + " " + entry.getValue());
        }



    }
}
