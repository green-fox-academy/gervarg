public class StringsAgain {
  public static void main(String[] args) {
    String word = "xanxarxchia";
    System.out.println(stringsAgain(word, "x"));
  }

  private static String stringsAgain(String word, String remove) {
    String space = "";
    if (!word.contains(remove)){
      return word;
    }
    else {
      return stringsAgain(word.replace(remove,space), remove);
    }
  }
}
