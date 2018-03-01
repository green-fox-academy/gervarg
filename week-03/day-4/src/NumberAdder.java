public class NumberAdder {
  public static void main(String[] args) {
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    int number = 6;
    System.out.println(numberAdder(number));
  }

  private static int numberAdder(int n) {
    int result = 0;
    if (n == 1){
      return 1;
    } else {
      result = numberAdder(n - 1) + n;
      return result;
    }
  }
}
