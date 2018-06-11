package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private boolean gender;
        private String where_from;
        private String job_title;

        public Human(String name, int age, int weight, boolean gender, String where_from, String job_title) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;
            this.where_from = where_from;
            this.job_title = job_title;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, boolean gender) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;
        }

        public Human(String name, int age, int weight, boolean gender, String where_from) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;
            this.where_from = where_from;
        }

        public Human(String name, boolean gender) {
            this.name = name;
            this.gender = gender;
        }
        public Human(String name,int age,boolean gender){
            this.name = name;
            this.age =age;
            this.gender = gender;
        }

        public Human(String name, String job_title) {
            this.name = name;
            this.job_title = job_title;
        }

        public Human(String name, int age, String job_title) {
            this.name = name;
            this.age = age;
            this.job_title = job_title;
        }
    }
}
