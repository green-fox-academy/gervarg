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
      int factorial;
      if(lengthOfFactorial == 1 || lengthOfFactorial == 0){
        return 1;
      }
        else {
        factorial = factorio(lengthOfFactorial-1)*lengthOfFactorial;
      }
      return factorial;
      /*
        for (int i = lengthOfFactorial; i > 0; i--){
             factorial *= i;
        }
        return factorial;*/
    }
}
