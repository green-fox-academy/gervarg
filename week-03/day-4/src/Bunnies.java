public class Bunnies {
  public static void main(String[] args) {
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    int numberOfBunnies = 20;
    System.out.println(bunnies(numberOfBunnies));

  }

  private static int bunnies(int numberOfBunnies) {
    if ( numberOfBunnies == 1){
      return 2;
    }
    else {
      System.out.println(" : " + 2 + " + bunnies(" + numberOfBunnies + " - 1)");
      return 2 + bunnies(numberOfBunnies - 1);
    }
  }

}
