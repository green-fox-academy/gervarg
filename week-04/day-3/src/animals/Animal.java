package animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String foodType;
  protected String livingTerritory;

  public String getName(){
    return this.name;
  }

  public abstract String breed();


}
