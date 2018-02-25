import java.util.ArrayList;
import java.util.Scanner;

public class HardOnes_Josephus {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int numberToSolve = userInput.nextInt();
    System.out.println(josephusProblem(numberToSolve));
  }

  private static String josephusProblem(int numberToSolve) {
    ArrayList<Integer> listOfNubers = new ArrayList<>();
    for (int i = 1; i <= numberToSolve; i++) {
      listOfNubers.add(i-1, i);
    }
    for (int i = 1; i < numberToSolve; i++) {
      for (int j = 1; j < listOfNubers.size(); j++) {
        if (numberToSolve % 2 != 0 && i == numberToSolve - 1) { //how to delete 1 after first circle??
          listOfNubers.remove(0);
        } else if (listOfNubers.size() == 2 && j == 1)
          listOfNubers.remove(0);
        else {
          listOfNubers.remove(j);
        }
      }

    }
    return listOfNubers.toString();
  }
}
