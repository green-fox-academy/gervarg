package Exercise_14_Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  Random randomNumber = new Random();
  private boolean shipWon;
  private List<Pirate> shipCrew = new ArrayList<>();

  public Ship(){
    this.shipWon = true;


  }

  public void fillShip(){
    int numberOfPiratesOnShip = randomNumber.nextInt(40)+5;
    for (int i = 0; i < numberOfPiratesOnShip; i++) {
      shipCrew.add(new Pirate("namefiller"));
      if (i < numberOfPiratesOnShip -1){
        shipCrew.get(i).captain();
        System.out.println(shipCrew.get(i) + " is the captain of the ship!");
      }
    }
  }

  public boolean battle(Ship enemyShip){
    int shipScore = shipCrew.size() - shipCrew.get(shipCrew.size()-1).getDrinkingCounter();
    int shipScoreEnemy = enemyShip.shipCrew.size() - enemyShip.shipCrew.get(enemyShip.shipCrew.size()-1).getDrinkingCounter();
    if (shipScore > shipScoreEnemy ){
      for (int i = 0; i < enemyShip.shipCrew.size() - randomNumber.nextInt(40); i++) {
        enemyShip.shipCrew.remove(i);
      }
      return shipWon;
    }
    else {
      for (int i = 0; i < shipCrew.size() - randomNumber.nextInt(40); i++) {
        shipCrew.remove(i);
      }
      return !shipWon;
    }
  }

  public void party(){
    if (shipWon){
      System.out.println("The pirates are having a party celebrating their victory!");
      for (Pirate pirates : shipCrew) {
        pirates.getDrinkingCounter();
      }
    } else {
      System.out.println("The losing ship doesn't get to party!");
    }
  }

}
