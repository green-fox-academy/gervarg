package Charsequence;

public class Gnirts implements CharSequence {
  String charFromBehind;

  public Gnirts(String charSquence){
    this.charFromBehind = charSquence;
  }
  @Override
  public int length() {
    return charFromBehind.length();
  }

  @Override
  public char charAt(int index) {
    return charFromBehind.charAt(length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

}
