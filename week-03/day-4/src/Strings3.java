public class Strings3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
    String word = "tellmeaboutit";
    System.out.println(addStarsToString(word, "*"));
  }

  private static String addStarsToString(String word, String s) {
    if (word.length() == 0) {
      return "";
    } else if (word.length() == 1){
      return word.charAt(0) + "";
    }
    else {
      return word.charAt(0)+ s + addStarsToString(word.substring(1), s);
    } //work in progress
  }
}
