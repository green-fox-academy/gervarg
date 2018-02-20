import java.util.*;

public class Exercise_09_CandyShop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
    public static String sweets(ArrayList<Object> replace){
        for (int i = 0; i < replace.size(); i++) {
            if (replace.get(i) == (Object)2){
                replace.set(i, "Croissant");
            }
            else if (replace.get(i) == (Object)false){
                replace.set(i, "Ice cream");
            }
        }
        return replace.toString();
    }
}