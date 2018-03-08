package Sum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  Sum testSum = new Sum();
  List<Integer> numbers = new ArrayList<>();


  @Test
  public void testSumNumbers() {
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    assertEquals(6,testSum.sumNumbers(numbers));
  }
  @Test (expected = NullPointerException.class)
  public void testSumNull(){
    numbers.add(null);
    assertEquals(6,testSum.sumNumbers(numbers));
  }
  @Test
  public void testSumOne(){
    numbers.add(3);
    assertEquals(3, testSum.sumNumbers(numbers));
  }
  @Test
  public void testSumZero(){
    numbers.add(0);
    assertEquals(0, testSum.sumNumbers(numbers));
  }
}