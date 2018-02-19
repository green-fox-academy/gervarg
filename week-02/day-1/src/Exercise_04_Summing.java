import java.util.Scanner;

public class Exercise_04_Summing {
    public static void main(String[] args){
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        Scanner userinput1 = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?");
        int howManyNumbers = userinput1.nextInt();
        int[] numbers = new int[howManyNumbers];
        System.out.println("Add the numbers you want to sum: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = userinput1.nextInt();
        }
        System.out.println("The sum of the numbers: " + sum(numbers));
    }
    public static int sum(int[] numbersToSum){
        int sumNumbers = 0;
        for (int i = 0; i < numbersToSum.length; i++){
            sumNumbers += numbersToSum[i];
        }
        return sumNumbers;
    }
}
