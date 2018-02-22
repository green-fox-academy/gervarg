import java.util.*;

public class Exercise_14_quoteswap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not",     "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }
    public static String quoteSwap(ArrayList<String> quote){
        String tester = "";
        ArrayList<String> newQuote = quote;
        for (int i = 0; i < quote.size() ; i++) {
            tester = quote.get(i);
            if (tester.contains("do")){
                quote.set(newQuote.indexOf("cannot"), tester);
            } else if (tester.contains("cannot")) {
                quote.set(newQuote.indexOf("do"), tester);
            }
            //quote.set(i, quote.get(i)+" ");*/
        }
        return quote.toString();
        }

}

