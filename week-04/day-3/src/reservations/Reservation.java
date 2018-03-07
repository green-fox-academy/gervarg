package reservations;

import java.util.Random;

public class Reservation implements Reservationy {
  private String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private Random random = new Random();
  private char[] alphabetAndNumbers = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();


  @Override
  public String getDowBooking() {
    int rngDay = random.nextInt(7);
    return  daysOfWeek[rngDay];
  }

  @Override
  public String getCodeBooking() {
    for (int i = 0; i < 8; i++) {
      
    }
    return null;
  }

  public void reservationLine(){
    System.out.println("Booking# " + getCodeBooking() + "for " + getDowBooking());
  }
}
