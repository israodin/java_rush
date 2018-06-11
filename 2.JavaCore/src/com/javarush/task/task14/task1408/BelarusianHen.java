package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Моя страна - "+Country.BELARUS+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";

    }
}
//Моя страна - Sssss. Я несу N яиц в месяц