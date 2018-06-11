package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

        public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = reader.readLine();
//        String file2 = reader.readLine();
//
////        String file1 = "E:\\Dropbox\\Workspaces\\JavaRush\\jr_for_beginner\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1820\\file1";
////        String file2 = "E:\\Dropbox\\Workspaces\\JavaRush\\jr_for_beginner\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1820\\file2";
//        reader.close();
//        ArrayList<String> list = new ArrayList<>();
//            BufferedReader f1 = new BufferedReader(new FileReader(file1));
//            while (f1.ready())
//                list.add(f1.readLine());
//            f1.close();
//
//            ArrayList<Long> values = new ArrayList<>();
//            for (String s : list)
//            {
//                for (String part : s.split(" ")){
//                    double a = Double.parseDouble(part);
//                    values.add(Math.round(a));
//                    }
//                }
//            }
//
//
//            FileWriter fos = new FileWriter(file2);
////        String line =  new String(buffer);
////        String [] line_arr = line.split("\n");
////        byte [] byte_arr ;
////        line = "";
////        for (int i = 0;i < line_arr.length;i++)
////        {
////            double line_d = Double.parseDouble(line_arr[i]);
////            int it = (int)Math.round(line_d);
////            line += it+" ";
////        }
////        line = line.trim();
////        byte_arr = line.getBytes();
//
//        FileOutputStream fos = new FileOutputStream(file2);
//        fos.write(byte_arr);
//        fos.close();
//
//    }
            Scanner sc = new Scanner(System.in);
            String fileName1 = sc.nextLine();
            String fileName2 = sc.nextLine();
            sc.close();
            try {
                Scanner in = new Scanner(new FileInputStream(fileName1));
                in.useLocale(Locale.ENGLISH);
                ArrayList<Float> list = new ArrayList<Float>();
                while (in.hasNext()) {
                    list.add(in.nextFloat());
                }
                in.close();
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
                for (float number: list) {
                    writer.write(Math.round(number) + " ");
                }
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
