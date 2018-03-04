package Homework;

public class Student {
  private String name;
  private int age;
  private String[] gender = {"male", "female"};
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String[] gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
  }

  public Student(){
    name = "Jane Doe";
    age = 30;
    gender[1] = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + " from " + previousOrganization +
    " who skipped " + skippedDays + " from the course already.");
  }

  public void getGoal(){
    System.out.println("Be a junior software developer");
  }
  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }


}
