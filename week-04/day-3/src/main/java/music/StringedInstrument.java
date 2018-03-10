package main.java.music;

abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument(){

  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public void play(){
    System.out.print(this.getClass().getSimpleName() + ", a " + numberOfStrings + "-stringed instrumentName that goes");
    sound();
  }

  abstract void sound();

}
