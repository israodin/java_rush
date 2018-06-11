package com.javarush.task.task15.task1531;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.math.BigInteger;

/*
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        String result ;
        BigInteger ress_tmp = BigInteger.ONE;
        if (n == 0){
            ress_tmp = BigInteger.ONE;
        }else if(n < 0)
        {
            ress_tmp = BigInteger.ZERO;
        }else
        {
            for(int i = 1;i <=n;i++)
            {
                ress_tmp = ress_tmp.multiply(BigInteger.valueOf(i));
            }

        }
        result = String.valueOf(ress_tmp);
        return result;
    }
}