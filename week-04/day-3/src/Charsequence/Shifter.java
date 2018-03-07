package Charsequence;

public class Shifter implements CharSequence {
  private String shifter;
  private int numberOfShifting;

  public Shifter(String shifter, int numberOfShifting) {
    this.shifter = shifter;
    this.numberOfShifting = numberOfShifting;
  }

  @Override
  public int length() {
    return shifter.length();
  }

  @Override
  public char charAt(int index) {
    return shifter.charAt(index + numberOfShifting);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
