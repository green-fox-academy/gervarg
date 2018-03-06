package Homework;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String cohortName;
  private List<Student> cohortStudents = new ArrayList<>();
  private List<Mentor> cohortMentors = new ArrayList<>();

  public Cohort(String cohortName) {
    this.cohortName = cohortName;
    cohortStudents = null;
    cohortMentors = null;
  }


  public void addStudent(Student student) {
    cohortStudents.add(student);
  }

  public void addMentor(Mentor mentor) {
    cohortMentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + cohortName + " cohort has " + cohortStudents.size() + "students and " +
            cohortMentors.size() + "mentors.");
  }
}
