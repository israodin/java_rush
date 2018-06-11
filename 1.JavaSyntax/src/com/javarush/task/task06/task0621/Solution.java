package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandMother = new Cat(grandMotherName);
        Cat catGrandFather = new Cat(grandFatherName);
        Cat catMother = new Cat(motherName,null,catGrandMother);
        Cat catFather = new Cat(fatherName,catGrandFather,null);
        Cat catSon = new Cat(sonName,catFather,catMother);
        Cat catDaughter = new Cat(daughterName, catFather,catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather,Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentFather == null && parentMother == null)
                return "Cat name is " + name + ", no mother, " + "no father" ;
            else if (parentMother == null) return "Cat name is "+  name + ", no mother, father is " +parentFather.name;
            else  if (parentFather == null) return "Cat name is "+name + " ,mother is "+parentMother.name+ ", no father";
            else
                return "Cat name is " + name + ", mother is "+parentMother.name+ ", father is "+ parentFather.name;
        }
    }

}
