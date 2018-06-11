package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("APRIL 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date giveDate = formater.parse(date);
        Date startYear = new Date(giveDate.getYear(),0,0);
        long interval = giveDate.getTime() - startYear.getTime();
        long s = (24*60*60*1000);
        int dayCounter = (int) (interval/s);
        if(dayCounter % 2 !=0)
        {
            return true;
        }

        return false;
    }
}
