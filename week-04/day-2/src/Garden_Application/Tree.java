package Garden_Application;

public class Tree extends Plant {
  private double wateringNeed;
  private double waterLevel;
  private double absorbtion;

  public Tree() {
    super();
    this.wateringNeed = 10;
    this.absorbtion = 0.4;

  }

  public Tree(String treeName, String treeColor, double wateringLevel) {
    super(treeName, treeColor, wateringLevel);
    this.wateringNeed = 10;
    this.waterLevel = wateringLevel;
    this.absorbtion = 0.4;
  }

  public double getWateringNeed() {
    return wateringNeed;
  }

  public double getAbsorbtion() {
    return absorbtion;
  }
}
