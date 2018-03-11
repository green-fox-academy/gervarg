package Aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    //airCraftTesting();
    carrierTesting();



  }
  public static void airCraftTesting(){
    Aircrafts f35Plane1 = new F35();
    Aircrafts f16Plane1 = new F16();
    System.out.println(f35Plane1.getStatus());
    f35Plane1.refill(300);
    f16Plane1.refill(200);
    System.out.println(f16Plane1.getStatus());
    System.out.println(f35Plane1.getStatus());
  }

  public static void carrierTesting(){
    Carrier midway = new Carrier(2300, 5000 );
    midway.addAircraft("F35");
    midway.addAircraft("F35");
    midway.addAircraft("F35");
    midway.addAircraft("F16");
    midway.addAircraft("F16");
    midway.fillAllAircrafts();
    System.out.println(midway.getStatus());
    Carrier lexington = new Carrier(2000, 2200);
    lexington.addAircraft("F35");
    lexington.addAircraft("F35");
    lexington.addAircraft("F35");
    lexington.addAircraft("F16");
    lexington.addAircraft("F16");
    lexington.fillAllAircrafts();
    System.out.println(lexington.getStatus());
    midway.carrierFight(lexington);
    System.out.println(midway.getStatus());
  }

}
