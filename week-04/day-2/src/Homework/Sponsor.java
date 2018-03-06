package Homework;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor() {
    super();
    hiredStudents = 0;
    company = "Google";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " old " + getGender() + " who represents " + company + " and hired" +
            hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}
