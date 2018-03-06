package Garden_Application;

public class Plant {
  private String nameOfPlant;
  private String colorOfPlant;
  private double wateringAmount;

  public Plant() {

  }

  public Plant(String nameOfPlant, String colorOfPlant, double wateringAmount) {
    this.nameOfPlant = nameOfPlant;
    this.colorOfPlant = colorOfPlant;
    this.wateringAmount = wateringAmount;
  }

  public void plantInformation(){

  }

  public String getNameOfPlant() {
    return nameOfPlant;
  }

  public void setNameOfPlant(String nameOfPlant) {
    this.nameOfPlant = nameOfPlant;
  }

  public String getColorOfPlant() {
    return colorOfPlant;
  }

  public void setColorOfPlant(String colorOfPlant) {
    this.colorOfPlant = colorOfPlant;
  }

  public double getWateringAmount() {
    return wateringAmount;
  }

  public void setWateringAmount(int wateringAmount) {
    this.wateringAmount = wateringAmount;
  }
}
