public class SumDigit {
  public static void main(String[] args) {
    int n = 123456;
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    System.out.println(sumDigit(n));

  }

  private static int sumDigit(int n) {
    if (n < 10){
      return n;
    }
    else{
      return sumDigit(n/ 10) + n % 10;
    }
  }
}
