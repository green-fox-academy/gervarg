package main.java.music;

public class Bass_Guitar extends StringedInstrument {

  public Bass_Guitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public Bass_Guitar() {
    numberOfStrings = 4;
  }

  @Override
  void sound() {
    System.out.println(" Duum-duum-duum");
  }
}
