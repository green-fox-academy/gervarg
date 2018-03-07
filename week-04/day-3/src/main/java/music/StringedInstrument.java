package main.java.music;

abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;


  public void play(){
    System.out.print(this.getClass().getSimpleName() + ", a " + numberOfStrings + "-stringed instrument that goes");
    sound();
  }

  abstract void sound();


}
