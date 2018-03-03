package Exercise_06_Animal;

public class Animal {
  private int hunger = 50;
  private int thirst = 50;

  public void eat(){
    hunger--;
  }
  public void drink(){
    thirst--;
  }
  public void play(){
    thirst++;
    hunger++;
  }
  public String toString(){
    return "hunger: " + hunger + ",thirst: " + thirst;
  }

}
