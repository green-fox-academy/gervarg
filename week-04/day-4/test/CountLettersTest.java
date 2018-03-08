import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {
  CountLetters letters = new CountLetters();

  @Test
  public void countLettersTestForLetter() {
    String text = "Let there be anarchy";
    assertEquals((Integer) 4, letters.countLetters(text).get((Character) 'e'));
  }

  @Test
  public void countLettersTestWithWhiteSpace() {
    String text = "Let there be anarchy";
    assertEquals((Integer) 3, letters.countLetters(text).get((Character) ' '));
  }
}