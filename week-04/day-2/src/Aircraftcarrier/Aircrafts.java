package Aircraftcarrier;

public class Aircrafts {
  private int maxAmmo;
  private int baseDamage;
  private int ammoStore;
  private String type;


  public Aircrafts() {
    this.ammoStore = 0;
  }

  public int refill(int storageOfAmmo) {
    if (ammoStore < maxAmmo) {
      storageOfAmmo = storageOfAmmo - (maxAmmo - ammoStore);
      setAmmoStore(maxAmmo);
    }
    return storageOfAmmo;
  }

  public int fight() {
    int damage = baseDamage * ammoStore;
    return damage;
  }


  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }


  public void setAmmoStore(int ammoStore) {
    this.ammoStore = ammoStore;
  }

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage +
            " All damage: " + fight() + "\n";
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
