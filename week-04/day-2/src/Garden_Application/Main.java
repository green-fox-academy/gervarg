package Garden_Application;

public class Main {
  public static void main(String[] args) {
   Flower tulip = new Flower("tulip", "yellow", 3);
   Flower rose = new Flower("rose", "red", 5);
   Tree birch = new Tree("birch","green", 3);
   Tree pine = new Tree("pine", "dark-green", 5);

   Garden ourGarden = new Garden();
   ourGarden.addFlowers(tulip);
   ourGarden.addFlowers(rose);
   ourGarden.addTrees(birch);
   ourGarden.addTrees(pine);
   ourGarden.gardenInfo();
   ourGarden.watering(30);
   ourGarden.gardenInfo();
  }
}
