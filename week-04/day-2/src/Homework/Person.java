package Homework;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private int age;
  private String gender;
  //private List<Person> person = new ArrayList<>();

  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender);
  }

  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }


}
