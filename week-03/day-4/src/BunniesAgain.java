public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    int numberOfBunnies = 5;
    System.out.println(bunniesAgain(numberOfBunnies));
  }

  private static int bunniesAgain(int numberOfBunnies) {
    if ( numberOfBunnies == 1){
      return 2;
    }
    else if( numberOfBunnies % 2 == 0){
      return 3 + bunniesAgain(numberOfBunnies - 1);
    }
    else{
      return 2+ bunniesAgain(numberOfBunnies - 1);
    }
  }
}
