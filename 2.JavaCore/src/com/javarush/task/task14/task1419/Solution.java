package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try{
            int z =10/0;
        }
        catch (ArithmeticException ex){
            exceptions.add(ex);
        }
        try{
            String s = null;
            String z = s;
        }catch(NullPointerException ne)
        {
            exceptions.add(ne);
        }
        try
        {
            int [] arr = new int[10];
            System.out.println(arr[12]);
        }catch(ArrayIndexOutOfBoundsException ed) {
            exceptions.add(ed);
        }try {
            int [] arr = new int[10];
//            arr[2] = 2.0;
        }catch (ArrayStoreException ae)
        {
            exceptions.add(ae);
        }try {
//            boolean flag = true;
//            main(flag);
        }catch (IllegalArgumentException ial)
        {
            exceptions.add(ial);
        }
        File file = new File("/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task14/task1419/test");
    }
}
