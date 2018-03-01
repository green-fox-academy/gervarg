public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
    String word = "xixixaxa";
    System.out.println(stringReplace(word, "x", "y"));
  }

  private static String stringReplace(String word, String from, String to) {
    if (!word.contains(from)) {
      return word;
    } else {
      return stringReplace(word.replaceFirst(from, to), from, to);
    }
  }
}

