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

  public void addAircraft(Aircrafts aircrafts){
    carrierAircrafts.add(aircrafts);
  }

}
