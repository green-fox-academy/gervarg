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
  }

  public void watering(double wateringAmount) {
    for (Plant currentPlant : gardenPlants)
      if (currentPlant.wateringNeeded()) {
        wateringAmount = wateringAmount / gardenPlants.size();
        currentPlant.setWaterLevel(wateringAmount + currentPlant.getWaterLevel());
      }
  }
}



