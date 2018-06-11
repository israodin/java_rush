package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbrers = new ArrayList<>();
        boolean flag = true;
        while(flag)
        {
            int num = 0;
            try {
                num = Integer.parseInt(in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }catch(NumberFormatException num_exp)
            {
                flag = false;
                for(int nummm : numbrers)
                {
                    System.out.println(nummm);
                }
            }
            numbrers.add(num);
        }
    }
}
