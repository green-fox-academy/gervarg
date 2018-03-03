package Exercise_09_TeacherStudent;

public class Main {
  public static void main(String[] args) {
    Student leslie = new Student("Leslie");
    Teacher marin = new Teacher("Marin");
    leslie.learn();
    leslie.question(marin);
    marin.answer();
    marin.teach(leslie);
  }
}
