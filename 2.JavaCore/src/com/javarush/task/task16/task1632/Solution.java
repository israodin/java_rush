package com.javarush.task.task16.task1632;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        threads.add(thread1);
        Thread2 thread2 = new Thread2();
        threads.add(thread2);
        Thread3 thread3 = new Thread3();
        threads.add(thread3);
        Thread4 thread4 = new Thread4();
        threads.add(thread4);
        Thread5 thread5 = new Thread5();
        threads.add(thread5);
    }
    public static void main(String[] args) {

    }

    private static class Thread1 extends Thread{
        @Override
        public void run(){
            while (true)
            {
            }
        }
    }

    private static class Thread2 extends Thread{

        @Override
        public void run(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");;
            }
        }
    }

    private static class Thread3 extends Thread{
        @Override
        public void run(){
           while (true)
           {
               try {
                   System.out.println("Ура");
                   Thread.sleep(500);
               } catch (InterruptedException e) {

               }
           }
        }
    }

    private static class Thread4 extends Thread implements Message{
        boolean isCancel = true;
        @Override
        public void showWarning() {
            this.isCancel=false;
        }
        @Override
        public void run(){
            while (isCancel){}


        }
    }

    private static class Thread5 extends Thread{

        @Override
        public void run() {
            BufferedReader readerr = new BufferedReader(new InputStreamReader(System.in));
            int result=0;
            boolean flag = true;
            while (flag)
            {
                try {
                    String word = readerr.readLine();
                    if(word.equals("N"))
                    {
                        System.out.println(result);
                        flag=false;
                    }else{
                        result+=Integer.parseInt(word);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}