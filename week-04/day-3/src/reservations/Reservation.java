package reservations;

import java.util.Random;

public class Reservation implements Reservationy {
  private String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private Random random = new Random();
  private char[] alphabetAndNumbers = "abcdefghijklmnopqrstuvwxyz0123456789".toUpperCase().toCharArray();


  @Override
  public String getDowBooking() {
    int rngDay = random.nextInt(daysOfWeek.length);
    return  daysOfWeek[rngDay];
  }

  @Override
  public String getCodeBooking() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      int rngCode = random.nextInt(alphabetAndNumbers.length);
      stringBuilder.append(alphabetAndNumbers[rngCode]);
    }
    return stringBuilder.toString();
  }

  public void reservationLine(){
    System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
  }
}
