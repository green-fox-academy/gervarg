import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map<Character, Integer> countLetters(String input) {
    Map<Character, Integer> collectionOFLetters = new HashMap<Character, Integer>();
    char[] arrayOfChars = input.toCharArray();
    char ch;
    for (int i = 0; i < input.length(); i++) {
      ch = arrayOfChars[i];
      if (collectionOFLetters.containsKey(ch)) {
        collectionOFLetters.put(ch, collectionOFLetters.get(ch) + 1);
      } else {
        collectionOFLetters.put(ch, 1);
      }
    }
    return collectionOFLetters;
  }
}

