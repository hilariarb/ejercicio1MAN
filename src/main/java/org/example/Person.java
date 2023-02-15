package org.example;
import java.util.List;
public class Person {
    private final String name;
    private final int age;
    private final String gender; //Male, Female


    /*
    Constructs a Person with a name, age and gender
    @param name : the name of the person
    @param age : the age of the person
    @param gender : the gender of the person
     */
    public Person(String name, int age, String gender){

    }

    public String name(){
        return name;
    }

    public int age(){
        return age;
    }

    public String gender(){
        return gender;
    }


    /*
    Computes average age of male and female persons in a list and returns the result
    in an array of two elements: the first element is the male mean age and the
    second one is the female mean age
    @param persons
    @return
     */
    public static double[] averageAgePerGender(List<Person> persons)throws RuntimeException{
        
    }
}
