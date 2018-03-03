package Exercise_14_Pirates;

import java.util.Random;

public class Pirate {
  private String pirateName;
  private int drinkingCounter;
  private boolean isItDead = false;
  private boolean passedOut;


  public Pirate(String pirateName){
    this.drinkingCounter = 0;
    this.pirateName = pirateName;
    passedOut = false;
  }

  public void drinkSomeRum(){
    if (isItDead){
      System.out.println(pirateName + " is dead!");
    } else {
      drinkingCounter++;
    }
  }
  public void howIsItGoingMate(){
    if (isItDead){
      System.out.println(pirateName + " is dead!");
    } else if (drinkingCounter < 4){
      System.out.println("Pour me anudder!");
      drinkSomeRum();
    }
    else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passedOut = true;
      System.out.println(pirateName + " passed out!");
    }
  }
  public void die(){
    isItDead = true;
    System.out.println(pirateName + " died!");
  }
  public void brawl(Pirate pirate){
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 1;

    if (randomNumber == 1){
      pirate.die();
      System.out.println(pirateName + " wins the fight againts " + pirate.pirateName + "!");
    }
    else if (randomNumber == 2){
      die();
      System.out.println(pirateName + " loses the fight to " + pirate.pirateName + " and dies!");
    }
    else{
      System.out.println("Both pirates passed out.");
      passedOut = true;
    }
  }

}
