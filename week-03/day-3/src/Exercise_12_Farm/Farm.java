package Exercise_12_Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  private List<Animal> farmAnimals = new ArrayList<>();
  private int spaceForAnimals = 12;

  public void breed(){
    if (spaceForAnimals > farmAnimals.size()){
      farmAnimals.add(new Animal());
    } else {
      System.out.println("There is no space left to breed new animals.");
    }
  }

  public void slaughter(){
    int highestHunger = 0;
    int highestHungerIndex = 0;
    for (int i = 0; i < farmAnimals.size(); i++) {
      if (farmAnimals.get(i).getHunger() < highestHunger ){
        highestHunger = farmAnimals.get(i).getHunger();
        highestHungerIndex = i;
      }
    }
    farmAnimals.remove(highestHungerIndex);
    System.out.println(farmAnimals.get(highestHungerIndex) + " has been slaughtered.");
  }

  public List<Animal> getFarmAnimals() {
    return farmAnimals;
  }

}
