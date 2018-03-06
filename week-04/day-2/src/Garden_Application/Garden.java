package Garden_Application;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> gardenPlants = new ArrayList<>();
  private double water;

  public Garden() {

  }

  public void addFlowers(Flower flower) {
    gardenPlants.add(flower);
  }
  public void addTrees(Tree tree){
    gardenPlants.add(tree);
  }



}
