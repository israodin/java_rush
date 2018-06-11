package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;


/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag)
        {
            String file_name = reader.readLine();
            if(file_name.equals("exit"))
            {
                flag=false;
                continue;
            }else
            {
                ReadThread readThread = new ReadThread(file_name);
                readThread.start();
                readThread.join();
            }
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName = null;
        ArrayList<Integer> list = new ArrayList<>();
        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available()>0) list.add(fis.read());
            fis.close();

        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run()
        {
            int element = list.get(0);
            for (Integer x : list) if (Collections.frequency(list, x) > Collections.frequency(list, element)) element = x;
            resultMap.put(fileName,element);

        }


    }
}
