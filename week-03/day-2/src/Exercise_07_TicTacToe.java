import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_07_TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O
    //System.out.println(ticTacResult("win-x.txt"));
    // should print X
    //System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  private static String  ticTacResult(String s) {
    Path path1 = Paths.get(s);
    String condition = "";
    try {
      List<String> ticTacToe = Files.readAllLines(path1);
      String[] str = new String[ticTacToe.size()];
      char[] ticTac = new char[str.length];
      for (int i = 0; i < ticTacToe.size(); i++) {
        str[i] = ticTacToe.get(i);


          if (str[i].equals("OOO" )){
            condition = "O";
            break;
          }
          else if(str[i].equals("XXX")){
            condition = "X";
            break;
          }
          else {
            condition = "draw";
          }
      }
      for (int j = 0; j < ticTac.length; j++) { //str to char array

      }
      String lola = str.toString();
      System.out.println(lola);


      //char[] ticTac = str.toCharArray();
      /*for (int i = 0; i < ticTac.length; i++) {
        if (ticTac.)
      }*/




    }
    catch (IOException e){
      e.printStackTrace();
    }

    return condition;
  }
}

