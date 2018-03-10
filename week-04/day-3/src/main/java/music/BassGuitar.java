package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    setNumberOfStrings(4);
  }

  @Override
  void sound() {
    System.out.println(" Duum-duum-duum");
  }
}
