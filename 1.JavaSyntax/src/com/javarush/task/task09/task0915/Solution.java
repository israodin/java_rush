package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

     public static void main(String[] args){
     try {
         processExceptions();

     } catch (CharConversionException ef) {
         BEAN.log(ef);
     } catch (FileSystemException e) {
         BEAN.log(e);
     }

     }

    public static void processExceptions() throws CharConversionException,FileSystemException{

            try {
                BEAN.methodThrowExceptions();

            }
            catch (FileSystemException e) {
                BEAN.log(e);
                throw e;
            }
            catch (IOException ex)
            {
                BEAN.log(ex);
            }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
