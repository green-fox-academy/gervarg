package Aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircrafts> carrierAircrafts = new ArrayList<>();
  private int ammoStore;
  private int carrierHealth;

  public Carrier(int ammoStore, int carrierHealth) {
    this.ammoStore = ammoStore;
    this.carrierHealth = carrierHealth;
  }

  public void addAircraft(String aircraftType) {
    if (aircraftType.equals("F35")) {
      carrierAircrafts.add(new F35());
    } else if (aircraftType.equals("F16")) {
      carrierAircrafts.add(new F16());
    } else {
      System.out.println("There is no such plane");
    }
  }

  public void fillAllAircrafts(int ammoStore) {
    for (int i = 0; i < carrierAircrafts.size(); i++) {
      Aircrafts planecheck = carrierAircrafts.get(i);
      if (ammoStore > carrierAircrafts.get(i).refill(ammoStore)) {
        carrierAircrafts.get(i).refill(ammoStore);
      } else if (ammoStore < carrierAircrafts.get(i).refill(ammoStore)) {
        if (planecheck.getType().equals("F35")) {
          carrierAircrafts.get(i).refill(ammoStore);
        }
      } else if (ammoStore == 0) {
        System.out.println("There is no ammo to refill");
      }
    }
  }

  public int totalDamage() {
    int totalDamage = 0;
    for (int i = 0; i < carrierAircrafts.size(); i++) {
      totalDamage += carrierAircrafts.get(i).fight();
    }
    return totalDamage;
  }

  public void carrierFight(Carrier enemyCarrier) {
    int enemyHealth = enemyCarrier.carrierHealth;
    enemyHealth -= totalDamage();
    if (enemyHealth <= 0) {
      System.out.println("It's dead Jim :(");
    }
  }

  public String getStatus() {
    String status = "HP: " + carrierHealth + ", Aircraft count: " + carrierAircrafts.size() + " Ammo Storage: "
            + ammoStore + ", Total Damage " + totalDamage() + "\n" + "Aircrafts:\n";
    for (int i = 0; i < carrierAircrafts.size(); i++) {
      status += carrierAircrafts.get(i).getStatus();
    }
    return status;
  }

}
