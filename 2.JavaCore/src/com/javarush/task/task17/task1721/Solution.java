package com.javarush.task.task17.task1721;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String allLines_file = reader.readLine();
            String forRemovesLines_file = reader.readLine();
            BufferedReader all_file = new BufferedReader(new InputStreamReader(new FileInputStream(allLines_file)));
            BufferedReader remove_file = new BufferedReader(new InputStreamReader(new FileInputStream(forRemovesLines_file)));
            read_from_file(all_file,allLines);
            read_from_file(remove_file,forRemoveLines);
            Solution solution = new Solution();
            solution.joinData();


        } catch (IOException e) {
            e.printStackTrace();
            throw new CorruptedDataException();
        }
    }

    private static void read_from_file(BufferedReader file,List<String> list ) throws IOException {
        while (file.ready()){
            list.add(file.readLine());
        }
        file.close();
    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
