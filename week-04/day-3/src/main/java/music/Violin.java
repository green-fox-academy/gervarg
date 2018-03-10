package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  public Violin() {
    setNumberOfStrings(4);
  }

  @Override
  void sound() {
    System.out.println(" Screech");
  }
}
