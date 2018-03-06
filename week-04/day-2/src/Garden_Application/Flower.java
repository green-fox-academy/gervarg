package Garden_Application;

public class Flower extends Plant {

  public Flower() {
    super();
  }

  public Flower(String nameOfFlower, String colorOfFlower, double wateringAmount) {
    super(nameOfFlower, colorOfFlower, wateringAmount);
  }

  public void flowerInformation(){
    if (getWateringAmount() < 5){
      System.out.println("The " + getColorOfPlant() + " " + getNameOfPlant() + " needs water");
    }
  }

  public void wateringFlower(){

  }
}
