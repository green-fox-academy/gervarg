package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public Violin() {
    numberOfStrings = 4;
  }

  @Override
  void sound() {
    System.out.println(" Screech");
  }
}
