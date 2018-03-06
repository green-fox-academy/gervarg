package Garden_Application;

public class Flower extends Plant {
  private double wateringNeed;
  private double waterLevel;

  public Flower() {
    super();
    this.wateringNeed = 5;
  }

  public Flower(String nameOfFlower, String colorOfFlower, double wateringLevel) {
    super(nameOfFlower, colorOfFlower, wateringLevel);
    this.wateringNeed = 5;
    this.waterLevel = wateringLevel;
  }

  public double getWateringNeed() {
    return wateringNeed;
  }
}
