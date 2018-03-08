import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram = new Anagram();

  @Test
  public void anagramTest() {
    String word1 = "gekko";
    String word2 = "kkoge";
    assertTrue(anagram.anagram(word1,word2));
  }
}