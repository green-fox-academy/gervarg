package flyable;

abstract public class Vehicle {
  private String vehicleName;
  private int age;
  private String color;

  public Vehicle(String vehicleName){
    this.vehicleName = vehicleName;
  }

  public String getVehicleName() {
    return vehicleName;
  }
}
