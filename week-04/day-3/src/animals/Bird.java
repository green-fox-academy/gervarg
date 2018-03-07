package animals;

public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
    this.livingTerritory = "air";
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
