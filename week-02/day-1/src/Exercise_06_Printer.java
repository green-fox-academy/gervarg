import java.util.Scanner;

public class Exercise_06_Printer {
    public static void main(String[] args){
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        /*Scanner userInput = new Scanner(System.in);
        System.out.println("How many words you want to print: ");
        int howManyWords = userInput.nextInt();
        String[] words = new String[howManyWords];
        for (int i = 0; i < words.length ; i++) {
            words[i] = userInput.next();
        }*/
        printer("first", "second", "third", "fourth");
    }
    public static void printer(String... inputParamter){
        for (int i = 0; i < inputParamter.length ; i++) {
            System.out.println(inputParamter[i]);
        }

    }
}
