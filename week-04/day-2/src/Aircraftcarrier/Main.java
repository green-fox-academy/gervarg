package Aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Aircrafts f35Plane1 = new F35();
    Aircrafts f16Plane1 = new F16();
    System.out.println(f35Plane1.getType());
    System.out.println(f35Plane1.getStatus());
    f35Plane1.refill(300);
    System.out.println(f35Plane1.getStatus());




  }
}
