package Garden_Application;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> gardenPlants = new ArrayList<>();

  public Garden() {

  }

  public void addFlowers(Flower flower) {
    gardenPlants.add(flower);
  }

  public void addTrees(Tree tree) {
    gardenPlants.add(tree);
  }

  public void gardenInfo() {

    for (Plant currentPlant : gardenPlants) {
      if (currentPlant.wateringNeeded()) {
        System.out.println("The " + currentPlant.getColorOfPlant() + " " + currentPlant.getNameOfPlant() + " needs water");
      } else {
        System.out.println("The " + currentPlant.getColorOfPlant() + " " + currentPlant.getNameOfPlant() + " doesn't need water.");
      }
    }
    System.out.println();
  }

  public void watering(double wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    List<Plant> plantsNeedingWater = new ArrayList<>();
    for (Plant currentPlant : gardenPlants) {
      if (currentPlant.wateringNeeded()) {
        plantsNeedingWater.add(currentPlant);
      }
    }
    wateringAmount = wateringAmount / plantsNeedingWater.size();
    for (Plant currentPlant : gardenPlants)
      if (currentPlant.wateringNeeded()) {
        currentPlant.setWaterLevel(wateringAmount * currentPlant.waterabsorbtion() + currentPlant.getWaterLevel());
      }
  }
}



