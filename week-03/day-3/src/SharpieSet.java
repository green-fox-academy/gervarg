import java.util.List;

public class SharpieSet {
  Sharpie sharpies = new Sharpie("red", 100);
  List<Sharpie> listOfSharpies;


  public int countUsable(List<Sharpie> listOfSharpies){
    int counter = 0;
    for (Sharpie sharpies : listOfSharpies) {
      if (sharpies.getInkAmount() > 0){
        counter++;
      }
    }
    return counter;
  }
  public List<Sharpie> removeTrash(List<Sharpie> listOfSharpies){
    for (int i = 0; i < listOfSharpies.size(); i++) {
      if (listOfSharpies.get(i).getInkAmount() <= 0){
        listOfSharpies.remove(i);
      }
    }
    return listOfSharpies;
  }
  public String toString() {
    return listOfSharpies.toString();
  }
}
