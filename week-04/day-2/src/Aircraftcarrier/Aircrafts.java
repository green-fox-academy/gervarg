package Aircraftcarrier;

public class Aircrafts {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int ammoBeforeFight;
  private String type;


  public Aircrafts() {
    this.currentAmmo = 0;
  }

  public int refill(int storageOfAmmo) {
    if (storageOfAmmo <= maxAmmo - currentAmmo) {
      currentAmmo += storageOfAmmo;
      storageOfAmmo = 0;
    } else{
      storageOfAmmo = storageOfAmmo - (maxAmmo - currentAmmo);
      setCurrentAmmo(maxAmmo);
    }
    return storageOfAmmo;
  }

  public int fight() {
    int maxDamage = baseDamage * currentAmmo;
    ammoBeforeFight = currentAmmo;
    setCurrentAmmo(0);
    return maxDamage;
  }


  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }


  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
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
