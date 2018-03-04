package Exercise_14_Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  Random randomNumber = new Random();
  private boolean shipWon;
  private String shipName;
  private List<Pirate> shipCrew = new ArrayList<>();
  private int shipScore;

  public Ship(String shipName){
    this.shipName = shipName;
    this.shipWon = true;
  }

  public void fillShip(){
    Pirate shipCaptain = null;
    int numberOfPiratesOnShip = randomNumber.nextInt(40)+5;
    for (int i = 0; i < numberOfPiratesOnShip; i++) {
      shipCrew.add(new Pirate("namefiller"));
      shipCaptain = shipCrew.get(0).captain();

    }
    System.out.println(shipCaptain.getPirateName() + " is the captain of the ship!");
    System.out.println("Captain Drunkness: " + shipCaptain.getDrinkingCounter() +  "\nIs he alive? "
    + shipCaptain.isItDead() + "\nIs he passed out? " + shipCaptain.isPassedOut());
  }

  public int calculateShipScore(){
    int shipScore = shipCrew.size() - shipCrew.get(0).getDrinkingCounter();
    return shipScore;
  }

  public boolean battle(Ship enemyShip){

    if (calculateShipScore() > enemyShip.calculateShipScore()){
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
        pirates.drinkSomeRum();
      }
    } else {
      System.out.println("The losing ship doesn't get to party!");
    }
  }

  public List<Pirate> getShipCrew() {
    return shipCrew;
  }
}
