package animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    this.name = name;
    this.livingTerritory = "air";
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void fly() {
    System.out.println("flapping wings");
  }

  @Override
  public void land() {
    System.out.println("claws grappling");
  }

  @Override
  public void takeOff() {
    System.out.println("flapping wings");
  }
}
