public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    fleet.add(new Thing("Get milk") );
    fleet.add(new Thing("Remove the obstacles") );
    Thing stand = new Thing("Stand up");
    stand.complete();
    fleet.add(stand);
    Thing eat = new Thing("Eat lunch");
    eat.complete();
    fleet.add(eat);
    
    System.out.println(fleet);
  }
}