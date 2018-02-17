import java.util.Scanner;
//still can't figure it out
public class Exercises_32_DrawDiagonal {

    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        int squareLines2 = scanner.nextInt();
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        for (int i = 0; i<= squareLines2+1; i++){
            System.out.print("%");
        }
        System.out.println();
        for (int j = 0; j < squareLines2; j++){
            System.out.print("%");
            for (int k = 0; k < squareLines2; k++) {
                System.out.print(" ");
            }
            System.out.print("%\n");
        }
        for (int i = 0; i <= squareLines2+1; i++) {
            System.out.print("%");
        }
    }
}
