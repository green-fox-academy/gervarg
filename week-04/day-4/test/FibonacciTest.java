import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibo = new Fibonacci();

  @Test
  public void fibonacciCalculateTest() {
    int numberToFibo = 8;
    assertEquals(21,fibo.fibonacciCalculate(numberToFibo));
  }
  @Test
  public void fibonacciCalculateTestZero() {
    int numberToFibo = 0;
    assertEquals(0,fibo.fibonacciCalculate(numberToFibo));
  }
  @Test
  public void fibonacciCalculateTestOne() {
    int numberToFibo = 1;
    assertEquals(1,fibo.fibonacciCalculate(numberToFibo));
  }
}