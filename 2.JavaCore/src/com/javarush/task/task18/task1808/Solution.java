package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos2 = new FileOutputStream(file2);
        FileOutputStream fos3 = new FileOutputStream(file3);
        byte [] buffer1 = null;
        byte [] buffer2 = null;
        if (fis.available()%2 == 0) {
            buffer1 = new byte[fis.available() / 2];
        }else {
            buffer1 = new byte[(fis.available() / 2) + 1];
        }
        buffer2 = new byte[(fis.available() / 2)];
        fos2.write(buffer1, 0 , fis.read(buffer1));
        fos3.write(buffer2, 0 , fis.read(buffer2));


        fis.close();
        fos2.close();
        fos3.close();

    }
}
