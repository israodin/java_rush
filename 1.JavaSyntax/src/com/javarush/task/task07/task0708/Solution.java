package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
 strings.add("wddeffrf");strings.add("feefefefeef");strings.add("fefefefefeefef");strings.add("efefefefeffeefef");strings.add("feefeefefefefefefe+");
//        int[] tmp = {strings.get(0).length(),strings.get(1).length(),strings.get(2).length(),strings.get(3).length(),strings.get(4).length()
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        int [] tmp = new int[5];
        for (int i = 0 ;i < 5;i++)
        {
            String line = in.readLine();
            strings.add(i,line);
            tmp[i] = line.length();
        }
        int t = 0;
        for (int i = 0 ; i < tmp.length;i++ )
        {
            for (int j = 0; j < tmp.length;j++ )
            {
                if(j < tmp.length-1)
                {
                    if (tmp[j] < tmp[j + 1])
                    {
                        String r1 = strings.get(j);
                        String r2 = strings.get(j+1);
                        t = tmp[j];

                        tmp[j] = tmp[j + 1];
                        strings.remove(j);
                        strings.add(j, r2);
                        tmp[j + 1] = t;
                        strings.remove(j + 1);
                        strings.add(j + 1, r1);

                    }
                }continue;
            }

        }
        System.out.println(strings.get(0));
        for (int i = 1; i < tmp.length;i++ )
        {
            if(tmp[i] >= tmp[0])
            System.out.println(strings.get(i));
        }
    }
}
