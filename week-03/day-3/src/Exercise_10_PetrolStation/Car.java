package Exercise_10_PetrolStation;

public class Car {
  private float gasAmount;
  private float capacity;

  public Car(float gasAmount, float capacity){
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public float getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(float gasAmount) {
    this.gasAmount = gasAmount;
  }

  public float getCapacity() {
    return capacity;
  }

  public void setCapacity(float capacity) {
    this.capacity = capacity;
  }
  public String toString() {
    return "Car fuel amount: " + gasAmount + "Capacity: " + capacity;
  }
}
