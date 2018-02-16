import java.util.Scanner;

public class Exercises_31_DrawSquare {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        int squareLines = scanner.nextInt();
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        for (int j = 0; j<= squareLines+1; j++){
            System.out.print("%");
        }
        System.out.println();
        for (int i = 0; i < squareLines; i++){
            System.out.print("%");
          for (int l = 0; l < squareLines; l++) {
                System.out.print(" ");
            }
            System.out.print("%\n");
        }
        for (int k = 0; k <= squareLines+1; k++) {
            System.out.print("%");

            }
    }
}
