package Exercise_12_Farm;

public class Main {
  public static void main(String[] args) {

    Farm animalFarm = new Farm();
    for (int i = 0; i < 13; ++i) {
      animalFarm.breed();
    }
    for (int i = 0; i < 6; i++) {
      if (i < 3) {
        animalFarm.getFarmAnimals().get(i).setHunger(30);
      } else {
        animalFarm.getFarmAnimals().get(i).setHunger(45);
      }
    }
    System.out.println(animalFarm.getFarmAnimals().size());
    animalFarm.slaughter();
    System.out.println(animalFarm.getFarmAnimals().size());
  }

}

