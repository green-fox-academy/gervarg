import java.util.*;

public class Exercise_10_ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }
    public static String containsSeven(ArrayList<Integer> numbersToCheck){
        String answer = "";
        for (int i = 0; i < numbersToCheck.size(); i++) {
            if (numbersToCheck.contains(7)){
                answer = "Hoorray";
            } else {
                answer = "Nooooo";
            }
        }
        return answer;
    }
}
