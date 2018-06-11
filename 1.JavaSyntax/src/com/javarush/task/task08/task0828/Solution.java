package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        List<String> list_month = new ArrayList<>();
        list_month.add("January");
        list_month.add("February");
        list_month.add("March");
        list_month.add("April");
        list_month.add("May");
        list_month.add("June");
        list_month.add("July");
        list_month.add("August");
        list_month.add("September");
        list_month.add("October");
        list_month.add("November");
        list_month.add("December");

        for(int i = 0;i < list_month.size();i++)
        {
            String tmp  = list_month.get(i);
            if(tmp.equals(month))
            {
                System.out.println(month+" is "+(i+1)+" month");
                return;
            }
        }
    }
}
