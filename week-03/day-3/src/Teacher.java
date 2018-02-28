public class Teacher {
  private String name;

  public Teacher(String name){
    this.name = name;
  }

  public void teach(Student student){
    student.learn();
  }
  public void answer(){

  }

}
