public class Power {
  public static void main(String[] args) {
    int n = 5;
    int numberBase = 2;
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    System.out.println(power(n, numberBase));
  }

  private static int power(int n, int number) {
    if (n == 0){
      return 1;
    }
    else {
      return number * power(n - 1,number);
    }



  }
}
