package Charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(0, 2));
// should print out: l

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    System.out.println(s.subSequence(4, 5));
// should print out: a
  }
}
