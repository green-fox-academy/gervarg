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

  @Test
  public void anagramWhitespace() {
    String word1 = "hello world";
    String word2 = "drlwo olleh";
    assertTrue(anagram.anagram(word1,word2));
  }
  @Test
  public void anagramFalseTest() {
    String word1 = "okkeyy";
    String word2 = "kkeyy";
    assertFalse(anagram.anagram(word1,word2));
  }

  @Test (expected = NullPointerException.class)
  public void anagramNull(){
    String word1 = null;
    String word2 = null;
    assertTrue(anagram.anagram(word1,word2));
  }
  @Test
  public void anagramEmptyStrings(){
    String word1 = "";
    String word2 = "";
    assertTrue(anagram.anagram(word1,word2));
  }
}