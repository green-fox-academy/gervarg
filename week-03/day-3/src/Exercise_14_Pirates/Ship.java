package Exercise_14_Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  Random randomNumber = new Random();
  private boolean shipWon;
  private String shipName;
  private List<Pirate> shipCrew = new ArrayList<>();
  private int minimumCrew = 5;
  private int maximumCrewRange = 40;

  public Ship(String shipName) {
    this.shipName = shipName;
    this.shipWon = true;
  }

  public void fillShip() {
    Pirate shipCaptain = null;
    int numberOfPiratesOnShip = randomNumber.nextInt(maximumCrewRange) + minimumCrew;
    for (int i = 0; i < numberOfPiratesOnShip; i++) {
      shipCrew.add(new Pirate(NameGenerator.generateName()));
      shipCaptain = shipCrew.get(0).captain();
    }
    randomDrunknessLevel();
    System.out.println(shipCaptain.getPirateName() + " is the captain of the ship!");
    System.out.println("Captain Drunkness: " + shipCaptain.getDrinkingCounter() + "\nIs he alive? "
            + shipCaptain.isHeAlive() + "\nIs he passed out? " + shipCaptain.isPassedOut());
  }

  public int calculateShipScore() {
    int shipScore = shipCrew.size() - shipCrew.get(0).getDrinkingCounter();
    return shipScore;
  }

  public boolean battle(Ship enemyShip) {

    if (calculateShipScore() > enemyShip.calculateShipScore()) {
      for (int i = 0; i < enemyShip.shipCrew.size() - randomNumber.nextInt(maximumCrewRange); i++) {
        enemyShip.shipCrew.remove(i);
      }
      return shipWon;
    } else {
      for (int i = 0; i < shipCrew.size() - randomNumber.nextInt(maximumCrewRange); i++) {
        shipCrew.remove(i);
      }
      return shipWon = false;
    }
  }

  public void party() {
    if (shipWon) {
      System.out.println("The pirates are having a party celebrating their victory!");
      randomDrunknessLevel();
    } else {
      System.out.println("The losing ship doesn't get to party!");
    }
  }

  public void randomDrunknessLevel() {
    for (int i = 0; i < shipCrew.size(); i++) {
      for (int j = 0; j < randomNumber.nextInt(3) + 1; j++) {
        shipCrew.get(i).drinkSomeRum();
      }
    }
  }

  public List<Pirate> getShipCrew() {
    return shipCrew;
  }
}
