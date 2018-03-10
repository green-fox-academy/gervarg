package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar() {
    setNumberOfStrings(6);
  }

  @Override
  void sound() {
    System.out.println(" Twang");
  }
}
