package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        int id = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String file_name = reader.readLine();
//       String file_name = "/Users/israodin/Dropbox/Workspaces/JavaRush/jr_for_beginner/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1822/data";
        reader.close();

        BufferedReader f = new BufferedReader(new FileReader(file_name));
        while (f.ready())
        {
            String s = f.readLine();
            if(s.startsWith(args[0]+" "))
            {
                System.out.println(s);
            }
        }
        f.close();
//
//        String line = new String(buffer);
//        String [] line_arr = line.split("id");
//        for(int i = 1 ; i < line_arr.length;i++)
//        {
//            String [] item_array = line_arr[i].split(" ");
//            int start_with =Integer.parseInt(item_array[0]);
//            if(start_with==id){
//                for(int y = 1 ;y < item_array.length;y++)
//                {
//                    System.out.print(item_array[y]+" ");
//                }
//            }else
//            {
//                continue;
//            }
//
//        }

    }
}
