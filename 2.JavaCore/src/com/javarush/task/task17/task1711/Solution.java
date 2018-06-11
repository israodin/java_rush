package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    private static final SimpleDateFormat format_input = new SimpleDateFormat("dd/MM/y");
    private static final SimpleDateFormat format_output = new SimpleDateFormat("dd-MMM-YYYY");
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        switch (args[0]){
            case ("-i"):synchronized (allPeople){viePersonsPerID(args);}break;
            case ("-c"):synchronized (allPeople){createNewPerson(args);}break;
            case ("-d"):synchronized (allPeople){deletePersons(args);}break;
            case ("-u"):synchronized (allPeople){updatePersonPerID(args);}break;
        }
    }

    private  static void updatePersonPerID(String[] args) throws ParseException {
        Person p ;
        String name;
        String gender;
        Sex sex;
        Date b_day;
        String bd;
        int id;
        for(int i = 1 ; i < args.length;i+=4){
          id = Integer.parseInt(args[i]);
          name = args[i+1];
          sex = (args[i+2]=="м")?Sex.MALE:Sex.FEMALE;
          bd = args[i+3];
          b_day = format_input.parse(bd);
          p = allPeople.get(id);
          p.setName(name);
          p.setSex(sex);
          p.setBirthDay(b_day);
        }

    }

    private  static void deletePersons(String[] args) {
        Person p ;
        String gender;
        Sex sex;
        Date b_day;
        int id;
        for (int i = 1 ;i < args.length;i++)
        {
            id = Integer.parseInt(args[i]);
            p=allPeople.get(id);
            p.setName(null);
            p.setSex(null);
            p.setBirthDay(null);
        }
    }

    private static void createNewPerson(String[] args) throws ParseException {
        Person p ;
        String name;
        Sex sex;
        Date b_day;
        String bd;
        for (int i = 1 ; i < args.length;i+=3)
        {
            name = args[i];
            sex = (args[i+1]=="м")?Sex.MALE:Sex.FEMALE;
            bd = args[i+2];
            b_day = format_input.parse(bd);
            if(sex == Sex.MALE){
                p = Person.createMale(name,b_day);
            }else {
                p = Person.createFemale(name,b_day);
            }
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }

    }

    private  static void viePersonsPerID(String[] args) {
        Person p;
        String gender;
        Sex sex;
        Date b_day;
       for(int i = 1;i < args.length;i++)
       {
           int id = Integer.parseInt(args[i]);
           p = allPeople.get(id);
           String name =p.getName();
           sex = p.getSex();
           if(sex.equals(Sex.MALE)){
               gender = "м";
           }else{
               gender = "ж";
           }
           b_day = p.getBirthDay();
           System.out.println(name+" "+gender+" "+format_output.format(b_day));
       }
    }
}
