package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        ArrayList<Integer> numeric = new ArrayList<>();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file_name)));
        while (reader.ready())
        {
            int num = Integer.parseInt(reader.readLine());
            if (num % 2 == 0)
            {
               numeric.add(num);
            }
        }
        int tmp;
        reader.close();
        for(int i = 0;i < numeric.size()-1;i++)
        {
            for (int j = 0; j < numeric.size()-1; j++) {

                if(numeric.get(j) > numeric.get(j+1) )
                {
                    tmp = numeric.get(j);
                    numeric.remove(j);
                    numeric.add(j,numeric.get(j));
                    numeric.remove(j+1);
                    numeric.add(j+1,tmp);
                }
            }
        }
        for (int num:numeric) {
            System.out.println(num);
        }
    }
}
