import java.util.ArrayList;
import java.util.Scanner;

public class HardOnes_Josephus {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int numberToSolve = userInput.nextInt();
    System.out.println(josephusProblem(numberToSolve));
  }

  public static ArrayList<Integer> prisoners(int numberToSolve){
    ArrayList<Integer> prisonersList = new ArrayList<>();
    for (int i = 1; i <= numberToSolve; i++) {
      prisonersList.add(i-1, i);
    }
    return prisonersList;
  }

  private static String josephusProblem(int numberToSolve) {
    ArrayList<Integer> listOfNumbers = (prisoners(numberToSolve));
    for (int i = 1; i < numberToSolve; i++) {
      for (int j = 1; j < listOfNumbers.size(); j++) {
        if (numberToSolve % 2 != 0 && listOfNumbers.get(listOfNumbers.size()-1) % 2 != 0) { //how to delete 1 after first circle??
          listOfNumbers.remove(0);
        } /*else if (listOfNumbers.size() == 2 && j == 1) {
          listOfNumbers.remove(0);
        }*/
        else {
          listOfNumbers.remove(j);
        }
      }

    }
    return listOfNumbers.toString();
  }
}
