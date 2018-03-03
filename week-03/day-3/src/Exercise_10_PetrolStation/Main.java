package Exercise_10_PetrolStation;

public class Main {
  public static void main(String[] args) {
    Station shell = new Station(1000);
    Car ferrari = new Car(10, 120);
    shell.refill(ferrari);
    System.out.println(shell.toString()+"\n"+ferrari.toString());
  }
}
