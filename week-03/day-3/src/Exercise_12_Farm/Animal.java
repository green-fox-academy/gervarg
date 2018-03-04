package Exercise_12_Farm;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal(){
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    thirst++;
    hunger++;
  }

  public String toString() {
    return "hunger: " + hunger + ",thirst: " + thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

}
