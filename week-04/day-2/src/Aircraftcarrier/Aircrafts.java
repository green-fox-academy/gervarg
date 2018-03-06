package Aircraftcarrier;

public class Aircrafts {
  private int maxAmmo;
  private int baseDamage;
  private int ammoStore;


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
    setAmmoStore(0);
    return damage;
  }


  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public String getType() {
    if (this instanceof F35) {
      return "F35";
    } else {
      return "F16";
    }
  }

  public void setAmmoStore(int ammoStore) {
    this.ammoStore = ammoStore;
  }

  public String getStatus(){
    return "Type " + getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage +
            " All damage: " + fight();
  }
}
