import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the distance in kilometers: ");
        int km = scanner.nextInt();
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Miles: " + (double) km * 0.62);
    }
}
