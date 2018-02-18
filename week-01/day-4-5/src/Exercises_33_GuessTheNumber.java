import java.util.Scanner;

public class Exercises_33_GuessTheNumber {
    static int storedNumber = (int)(Math.random() * 100 + 1);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number between 1-100: ");
        int guessNumber = scanner.nextInt();
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        while ((guessNumber < storedNumber) || (guessNumber > storedNumber)){
            if (guessNumber < storedNumber){
                System.out.println("The stored number is higher");
                guessNumber = scanner.nextInt();
            }
            else if (guessNumber > storedNumber){
                System.out.println("The stored number is lower");
                guessNumber = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + guessNumber);
    }
}



