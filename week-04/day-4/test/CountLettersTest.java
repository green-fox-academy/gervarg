import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters letters = new CountLetters();

  @Test
  public void countLetters() {
    String text = "Let there be anarchy";
    assertEquals((Integer)4,letters.countLetters(text).get((Character)'e'));
  }
}