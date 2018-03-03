package Exercise_11_SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Sharpie sharp1 = new Sharpie("red", 55);
    sharp1.use();
    System.out.println(sharp1);
    List<Sharpie> sharpieList = new ArrayList<>();
    SharpieSet theActualList = new SharpieSet();

    Sharpie sharp2 = new Sharpie("brown", 67, 100);
    Sharpie sharp3 = new Sharpie("purple", 45, 34);
    sharpieList.add(sharp1);
    sharpieList.add(sharp3);
    sharpieList.add(sharp2);
    sharpieList.add(sharp1);
    sharpieList.add(sharp2);



    System.out.println("The size of the sharpies is " + sharpieList.size());
    System.out.println("Number of sharpies with inkamount: " + theActualList.countUsable(sharpieList));
    System.out.println("Number of sharpies after removal: " + theActualList.removeTrash(sharpieList).size());
  }
}
