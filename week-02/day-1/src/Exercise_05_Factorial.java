import java.util.Scanner;

public class Exercise_05_Factorial {
    public static void main(String[] args){
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which numbers factorial you want to get?");
        int numberToFactorial = userInput.nextInt();
        System.out.print("The factorial of that number is: ");
        System.out.println(factorio(numberToFactorial));
    }
    public static int factorio(int lengthOfFactorial){
        int factorial=1;
        for (int i = lengthOfFactorial; i > 0; i--){
             factorial *= i;
        }
        return factorial;
    }
}
