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
    if (aircraftType.toUpperCase().equals("F35")) {
      carrierAircrafts.add(new F35());
    } else if (aircraftType.toUpperCase().equals("F16")) {
      carrierAircrafts.add(new F16());
    } else {
      System.out.println("There is no such plane");
    }
  }

  public void fillAllAircrafts() {
    if (ammoStore <= 0) {
      System.out.println("Sorry pal we're outta ammo");
    } else {
      fillF35Planes();
      fillF16Planes();
    }
  }

  public void fillF35Planes() {
    for (Aircrafts f35Planes : carrierAircrafts) {
      if (f35Planes.getType().equals("F35")) {
        ammoStore = f35Planes.refill(ammoStore);
      }
    }
  }

  public void fillF16Planes() {
    for (Aircrafts f16Planes : carrierAircrafts) {
      if (f16Planes.getType().equals("F16")) {
        ammoStore = f16Planes.refill(ammoStore);
      }
    }
  }

  public int totalDamage() {
    int totalDamage = 0;
    for (Aircrafts carrierAircraft : carrierAircrafts) {
      totalDamage += carrierAircraft.fight();
    }
    return totalDamage;
  }

  public void carrierFight(Carrier enemyCarrier) {
    int enemyHealth = enemyCarrier.carrierHealth;
    enemyHealth -= totalDamage();
    carrierHealth -= enemyCarrier.totalDamage();
    setCarrierHealth(carrierHealth);
    enemyCarrier.setCarrierHealth(enemyHealth);
    if (enemyHealth <= 0) {
      System.out.println("We've destroyed the enemy!");

    } else if (carrierHealth <= 0) {
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

  public void setCarrierHealth(int carrierHealth) {
    this.carrierHealth = carrierHealth;
  }
}
