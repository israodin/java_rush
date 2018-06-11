package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fileOutputStream;
    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(String.valueOf(fileOutputStream));
        this.fileOutputStream = fileOutputStream;
    }
    public void close() throws IOException {
        flush();
        write(getBytes());
        fileOutputStream.close();
    }
    public void flush() throws IOException {
        fileOutputStream.flush();
    }
    public byte[] getBytes()
    {
        String line = "JavaRush © All rights reserved.";
        byte [] aray_b = line.getBytes();
        return aray_b;
    }
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b,off,len);
    }
    public void write(byte [] b) throws IOException {
        fileOutputStream.write(b);
    }
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
