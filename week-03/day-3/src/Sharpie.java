public class Sharpie {
  private String color;
  private float width;
  private float inkAmount = 100;

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
  }
  public void use(){
    inkAmount--;
  }
  public String toString(){
    return "Color of Sharpie: " + color + " , width of Sharpie: " + width + " Usage of Sharpie from 100: " + inkAmount;
  }

}
