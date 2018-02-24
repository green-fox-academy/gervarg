public class Exercise_03_TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String(quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
      System.out.println(quote.indexOf("It"));
      System.out.println(swapWords(quote));

    }
    public static String swapWords(String quoteToFix){
      quoteToFix = quoteToFix.substring(0, 21) + "always takes longer than " + quoteToFix.substring(21,quoteToFix.length());
      return quoteToFix;
    }
}
