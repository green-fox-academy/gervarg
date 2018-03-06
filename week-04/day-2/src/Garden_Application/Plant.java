package Garden_Application;

public class Plant {
  private String nameOfPlant;
  private String colorOfPlant;
  private double waterLevel;

  public Plant() {

  }

  public Plant(String nameOfPlant, String colorOfPlant, double wateringAmount) {
    this.nameOfPlant = nameOfPlant;
    this.colorOfPlant = colorOfPlant;
    this.waterLevel = wateringAmount;
  }

  public boolean wateringNeeded() {
    if (this instanceof Flower) {
      return waterLevel < ((Flower) this).getWateringNeed();
    } else {
      return waterLevel < ((Tree) this).getWateringNeed();
    }
  }


  public String getNameOfPlant() {
    return nameOfPlant;
  }

  public String getColorOfPlant() {
    return colorOfPlant;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
}
