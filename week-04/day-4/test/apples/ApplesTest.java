package apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  Apples apple = new Apples();

  @Test
  public void testGetApple() {
    assertEquals("apple", apple.getApple());
  }
}
