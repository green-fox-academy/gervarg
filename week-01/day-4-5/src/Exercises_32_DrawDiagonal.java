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
        for (int i = 0; i<= squareLines2; i++){
            System.out.print("%");
        }
        System.out.println();
        for (int j=1 ; j<squareLines2; j++){
            for (int k = 0; k<=squareLines2 ; k++){
                if (k == 0 || k == j || k == squareLines2){
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       for (int i = 0; i <= squareLines2; i++) {
           System.out.print("%");
       }
    }
}
