package Garden_Application;

public class Flower extends Plant {
  private double wateringNeed;
  private double waterLevel;
  private double absorbtion;

  public Flower() {
    super();
    this.wateringNeed = 5;
    this.absorbtion = 0.75;

  }

  public Flower(String nameOfFlower, String colorOfFlower, double wateringLevel) {
    super(nameOfFlower, colorOfFlower, wateringLevel);
    this.wateringNeed = 5;
    this.waterLevel = wateringLevel;
    this.absorbtion = 0.75;
  }

  public double getWateringNeed() {
    return wateringNeed;
  }

  public double getAbsorbtion() {
    return absorbtion;
  }
}
