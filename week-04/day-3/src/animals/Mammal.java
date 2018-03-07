package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
    this.livingTerritory = "mixed";
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }
}
