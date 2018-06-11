package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format_input = new SimpleDateFormat("dd/MM/y");
        SimpleDateFormat format_output = new SimpleDateFormat("dd-MMM-YYYY");

        //start here - начни тут
        String modificator = args[0];
        String name ;
        Sex sex ;
        String bd ;
        Date b_day;
        Person p;
        int id ;
        switch (modificator) {
            case "-c":
                name = args[1];
                sex = (args[2]=="м")?Sex.MALE : Sex.FEMALE;
                bd = args[3];
                b_day  = format_input.parse(bd);
                if (sex==Sex.MALE){
                    p = Person.createMale(name,b_day);
                }else{
                    p = Person.createFemale(name,b_day);
                }
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));
                break;
            case "-i":
                id = Integer.parseInt(args[1]);
                p = allPeople.get(id);
                name = p.getName();
                sex = p.getSex();
                String sex_str ;
                if(sex.equals(Sex.MALE)){
                    sex_str = "м";
                }else{
                    sex_str = "ж";
                }
                b_day = p.getBirthDay();
                System.out.println(name +" "+sex_str+" "+format_output.format(b_day));
                break;
            case "-u":
                id = Integer.parseInt(args[1]);
                name = args[2];
                sex = (args[3] == "m")?Sex.MALE : Sex.FEMALE;
                bd = args[4];
                b_day= format_input.parse(bd);
                p = allPeople.get(id);
                p.setName(name);
                p.setSex(sex);
                p.setBirthDay(b_day);
                break;
            case "-d":
                id = Integer.parseInt(args[1]);
                p = allPeople.get(id);
                p.setName(null);
                p.setSex(null);
                p.setBirthDay(null);
                break;
        }


        }

    private static void addNewPerson(String name, String sex, Date b_day) {


    }


}
