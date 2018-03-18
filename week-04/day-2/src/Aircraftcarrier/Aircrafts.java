package Aircraftcarrier;

public class Aircrafts {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int ammoBeforeFight;
  private String type;


  public Aircrafts() {
    this.currentAmmo = 0;
    this.ammoBeforeFight = currentAmmo;
  }

  public int refill(int storageOfAmmo) {
    if (storageOfAmmo <= maxAmmo - currentAmmo) {
      setCurrentAmmo(currentAmmo += storageOfAmmo);
      storageOfAmmo = 0;
    } else {
      storageOfAmmo = storageOfAmmo - (maxAmmo - currentAmmo);
      setCurrentAmmo(maxAmmo);
    }
    setAmmoBeforeFight(currentAmmo);
    return storageOfAmmo;
  }

  public int fight() {
    return baseDamage * currentAmmo;
  }


  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setAmmoBeforeFight(int ammoBeforeFight) {
    this.ammoBeforeFight = ammoBeforeFight;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammoBeforeFight + ", Base Damage: " + baseDamage +
            " All damage: " + fight() + "\n";
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
