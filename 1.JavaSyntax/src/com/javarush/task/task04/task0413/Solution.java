package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String mon = "понедельник";
        String teu = "вторник";
        String wed = "среда";
        String thu = "четверг";
        String fri = "пятница";
        String set = "суббота";
        String sun = "воскресенье";
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if(num == 1){System.out.println(mon);
        }else if(num == 2){System.out.println(teu);
        }else if(num == 3){System.out.println(wed);
        }else if(num == 4){System.out.println(thu);
        }else if(num == 5){System.out.println(fri);
        }else if(num == 6){System.out.println(set);
        }else if(num == 7) {
            System.out.println(sun);
        }else
        {
            System.out.println("такого дня недели не существует");
        }
    }
}