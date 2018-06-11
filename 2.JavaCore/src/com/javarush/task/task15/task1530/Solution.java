package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker latte_dr = new LatteMaker();
        latte_dr.makeDrink();
        DrinkMaker tea_dr = new TeaMaker();
        tea_dr.makeDrink();

    }
}
