import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int lightX = 0; // the X position of the light of power
    int lightY = 17; // the Y position of the light of power
    int initialTX = 31; // Thor's starting X position
    int initialTY = 4; // Thor's starting Y position

    // game loop
    while (true) {
      int remainingTurns = in.nextInt();
      int thorX = initialTX;
      int thorY = initialTY;// The remaining amount of turns Thor can move. Do not remove this line.
      if ( lightY < thorY && lightX == thorX ) {
        System.out.println("N");
        thorY++;
      }
      else if (lightX > thorX && lightY == thorY){
        System.out.println("E");
        thorX++;
      }
      else if(lightX < thorX && lightY == thorY ) {
        System.out.println("W");
        thorX--;
      }

      else if(lightX < thorX && lightY > thorY) {
        System.out.println("SW");
        thorX--;
        thorY++;
      }

      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");
      //System.err.println("Debug messages...");

      // A single line providing the move to be made: N NE E SE S SW W or NW

    }
  }
}