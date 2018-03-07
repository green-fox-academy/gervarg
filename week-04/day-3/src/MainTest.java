import flyable.*;
import animals.*;

public class MainTest {
  public static void main(String[] args) {
    Helicopter soviet = new Helicopter("Kamka ka-90");
    soviet.fly();
    soviet.land();
    soviet.takeOff();
    Bird canary = new Bird("Canary");
    canary.breed();
    canary.fly();
    canary.takeOff();
    canary.land();

  }
}
