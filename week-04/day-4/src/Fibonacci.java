public class Fibonacci {

  public int fibonacciCalculate(int number) {
    if (number == 0){
      return 0;
    } else if (number == 1){
      return 1;
    } else {
      return fibonacciCalculate(number - 1) + fibonacciCalculate( number - 2);
    }
  }
}
