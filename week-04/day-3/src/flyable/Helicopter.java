package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name){
    this.name = name;
  }
  @Override
  public void fly() {
    System.out.println("Swoosh-swoosh");
  }

  @Override
  public void land() {
    System.out.println(name + " lands vertically");
  }

  @Override
  public void takeOff() {
    System.out.println(name + " takes off from the same position");
  }
}
