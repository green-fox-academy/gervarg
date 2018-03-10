package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String helicopterName){
    super(helicopterName);
  }
  @Override
  public void fly() {
    System.out.println("Swoosh-swoosh");
  }

  @Override
  public void land() {
    System.out.println(getVehicleName() + " lands vertically");
  }

  @Override
  public void takeOff() {
    System.out.println(getVehicleName() + " takes off from the same position");
  }
}
