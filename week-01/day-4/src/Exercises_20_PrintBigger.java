import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for two numbers and prints the bigger one
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo){
            System.out.println(numberOne);
        }
        else {
            System.out.println(numberTwo);
        }

    }
}
