import reservations.Reservation;

public class Hotel {
  public static void main(String[] args) {
    Reservation christmas = new Reservation();
    for (int i = 0; i < 10; i++) {
      christmas.reservationLine();
    }
  }
}
