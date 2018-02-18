import java.util.Scanner;

public class Exercises_35_DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        Scanner scanner = new Scanner(System.in);
        int sizeOfTable = scanner.nextInt();
        for (int rows = 1; rows <= sizeOfTable; rows++) {
            for (int columns = 0; columns <= sizeOfTable; columns++) {
                if (columns % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            if (rows % 2 == 0) {
                System.out.println();
            } else {
                System.out.print("\n ");
            }
        }
    }
}