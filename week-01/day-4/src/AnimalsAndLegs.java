import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickens = scanner.nextInt();
        int pigs = scanner.nextInt();
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        int chickenlegs = chickens *2;
        int piglegs = pigs * 4;
        System.out.println("The animals have " + (chickenlegs+piglegs) + " legs.");

    }
}
