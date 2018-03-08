import java.util.Arrays;

public class Anagram {


  public boolean anagram(String word1,String word2){
    char[] charsOfWord1 = word1.replaceAll("[\\s]", "").toCharArray();
    char[] charsOfWord2 = word2.replaceAll("[\\s]", "").toCharArray();
    Arrays.sort(charsOfWord1);
    Arrays.sort(charsOfWord2);
    return Arrays.equals(charsOfWord1,charsOfWord2);
  }

}
