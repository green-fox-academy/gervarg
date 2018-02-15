public class Exercises_13_SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        currentSeconds = (currentHours*60*60) + (currentMinutes*60) + currentSeconds;
        int remainingSeconds = (60*60*24)-currentSeconds;
        System.out.println(remainingSeconds);
    }
}
