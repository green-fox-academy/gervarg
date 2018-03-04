package Homework;

public class Person {
  private String name;
  private int age;
  private String[] gender = {"male", "female"};

  public Person(String name, int age, String[] gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(){
    name = "Jane Doe";
    age = 30;
    gender[1] = "female";
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender);
  }

  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }

}
