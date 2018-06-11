package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String url = reader.readLine();
            String line = url.substring(url.indexOf('?')+1);
            String [] parametr = line.split("&");
            ArrayList <String> params_obj = new ArrayList<String>();
            for (int i = 0 ;i < parametr.length;i++)
            {
                if (parametr[i].contains("=")){
                    String [] tmp = parametr[i].split("=");
                    if(tmp[0].equals("obj")){
                        params_obj.add(parametr[i]);
                        System.out.print(tmp[0]+" ");
                    }else
                    {
                        System.out.print(tmp[0]+" ");
                    }
                }else
                {
                    System.out.print(parametr[i]+" ");
                }

            }
            System.out.println();
            if(params_obj.size()!=0)
            {
                for (String s : params_obj)
                {
                    try
                    {
                        double value = Double.parseDouble(s.split("=")[1]);
                        alert(value);
                    }
                    catch (NumberFormatException num){
                        alert(s.split("=")[1]);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
