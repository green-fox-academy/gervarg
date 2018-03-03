package Exercise_14_Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  Random randomNumber = new Random();

  List<Pirate> shipCrew = new ArrayList<>();

  public Ship(){


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

}
