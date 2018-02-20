import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_07_MatchMaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static String makingMatches(ArrayList<String> girlsToMatch, ArrayList<String> boysToMatch){
        int count = 0;
        for (int i = 0; i < girlsToMatch.size() ; i++) {
            boysToMatch.add(count+i, girlsToMatch.get(i));
            count++;
        }
        return boysToMatch.toString();
    }
}
