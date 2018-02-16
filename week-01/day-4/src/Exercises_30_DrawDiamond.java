import java.util.Scanner;
//still trying to figure out the solution
public class Exercises_30_DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamondHeight = scanner.nextInt();
        for (int i = 1; i < diamondHeight; i+=2)
        {
            for (int k = 0; k < diamondHeight-(i/2) ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = diamondHeight-1; i > 0; i-=2){
            for (int k = diamondHeight; k > diamondHeight-i ; k--){
                System.out.print(" ");
            }
            for (int j = diamondHeight; j > i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


