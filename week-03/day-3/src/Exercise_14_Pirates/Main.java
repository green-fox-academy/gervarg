package Exercise_14_Pirates;

public class Main {
  public static void main(String[] args) {
    Pirate jack = new Pirate("Jack Sparrow");
    Pirate barbossa = new Pirate("Hector Barbossa ");
    jack.howIsItGoingMate();
    jack.brawl(barbossa);
    Ship pearl = new Ship("Black Pearl");
    pearl.fillShip();
    System.out.println(pearl.getShipCrew().size());
    Ship dutch = new Ship("The flying Dutch");
    dutch.fillShip();
    System.out.println(dutch.getShipCrew().size());
    pearl.battle(dutch);
    pearl.party();


  }
}
