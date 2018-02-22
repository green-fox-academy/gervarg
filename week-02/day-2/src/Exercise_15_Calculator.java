import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15_Calculator {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Please type in the expression: ");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        calculate(input);
    }

    private static void calculate(String input) {
        String[] toCalc = input.split(" ");
        int number1 = Integer.valueOf(toCalc[1]);
        int number2 = Integer.valueOf(toCalc[2]);
        int result = 0;
        if (toCalc[0].equals("+")){
            result = number1 + number2;
        }
        else if (toCalc[0].equals("-")){
            result = number1 - number2;
        }
        else if (toCalc[0].equals("*")){
            result = number1 * number2;
        }
        else if (toCalc[0].equals("/")){
            result = number1 / number2;
        }
        else if (toCalc[0].equals("%")){
            result = number1 + number2;
        }
        System.out.println("The result is: " + result);
    }
}
