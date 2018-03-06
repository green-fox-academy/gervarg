package Garden_Application;

public class Tree extends Plant {
  private double wateringNeed;
  private double waterLevel;

  public Tree() {
    super();
    this.wateringNeed = 10;

  }

  public Tree(String treeName, String treeColor, double wateringLevel) {
    super(treeName, treeColor, wateringLevel);
    this.wateringNeed = 10;
    this.waterLevel = wateringLevel;
  }

  public double getWateringNeed() {
    return wateringNeed;
  }
}
