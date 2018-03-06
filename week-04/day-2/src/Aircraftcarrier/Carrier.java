package Aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircrafts> carrierAircrafts = new ArrayList<>();
  private int ammoStore;
  private int carrierHealth;

  public Carrier(int ammoStore, int carrierHealth){
    this.ammoStore = ammoStore;
    this.carrierHealth = carrierHealth;
  }

  public void addAircraft(String aircraftType){
    if (aircraftType.equals("F35")){
      carrierAircrafts.add(new F35());
    } else if (aircraftType.equals("F16")){
      carrierAircrafts.add(new F16());
    }
  }

  public void fillAllAircrafts(int ammoStore){

  }

  public void carrierFight(Carrier carrier){
    //for ( : carrierAircrafts) {


  }

}
