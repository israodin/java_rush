package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());

    }

    public interface ReadFileInterface{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String filename;
        private String filecontent = "";
        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }

        @Override
        public String getFileContent() {

            return filecontent.trim();
        }
        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
                String line;
                while (fileReader.ready()) {
                    filecontent += fileReader.readLine() + " ";
                }
                fileReader.close();

            } catch (IOException e) {
                System.out.println("ошибка");
            }
        }
    }


}
