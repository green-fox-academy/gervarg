package main.java.music;

public class Electric_Guitar extends StringedInstrument {

  public Electric_Guitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public Electric_Guitar() {
    numberOfStrings = 6;
  }

  @Override
  void sound() {
    System.out.println(" Twang");
  }
}
