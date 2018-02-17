import java.util.Scanner;

public class Exercises_34_ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers sum and average you want?: ");
        int howManyInputs = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers: ");

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        for (int i = 0; i < howManyInputs; i++){
            int askedNumbers = scanner.nextInt();
                sum += askedNumbers;
        }
         int average = sum / howManyInputs;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
