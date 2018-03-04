package Homework;

public class Sponsor {
  private String name;
  private int age;
  private String gender;
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }

  public Sponsor(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    hiredStudents = 0;
    company = "Google";
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + " who represents " + company + " and hired" +
    hiredStudents + " students so far.");
  }

  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire(){
    hiredStudents++;
  }
}
