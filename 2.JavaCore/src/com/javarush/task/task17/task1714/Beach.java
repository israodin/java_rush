package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements  Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach b1 = new Beach("Beach1", (float) 10.0,50);
        Beach b2 = new Beach("Beach2", (float) 15.0,50);
        Beach b3 = new Beach("Beach3", (float) 15.0,50);
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b1));
        System.out.println(b3.compareTo(b2));
    }

    @Override
    public synchronized int compareTo(Beach o) {
//        int resault = 0;
//        if(o.quality > this.quality)
//        {
//            resault++;
//        }else if (o.distance > this.distance)
//        {
//            resault++;
//        }
//        if(o.quality < this.quality)
//        {
//            resault--;
//        }else if (o.distance < this.distance)
//        {
//            resault--;
//        }
//
//        return resault;
//        if (this.quality >= o.quality || (o.distance - this.distance) <= 1) {
//            return this.quality - o.quality;
//        }
//        return o.quality - this.quality;
        return  (int)(this.getQuality()*this.getDistance())-(int)(o.getQuality()*o.getDistance());
    }
}
