package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
    this.livingTerritory = "surface";
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
