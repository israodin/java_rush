package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double tmp1 = Math.pow((x2-x1),2);
        double tmp2 = Math.pow((y2-y1),2);
        double tmp = tmp1+tmp2;
        return Math.sqrt(tmp);

    }

    public static void main(String[] args) {

    }
}
