package Exercise_10_PetrolStation;

public class Station {
  private float gasAmountStation = 1000;

  Car lamborghini = new Car(0,100);

  public Station(float gasAmountStation){
    this.gasAmountStation = gasAmountStation;
  }

  public void refill(Car lamborghini){
    gasAmountStation -= lamborghini.getCapacity()- lamborghini.getGasAmount();
    lamborghini.setGasAmount(lamborghini.getGasAmount()+(lamborghini.getCapacity()- lamborghini.getGasAmount()));

  }
  public String toString() {
    return "Gas station gas amount: " + gasAmountStation;
  }
}
