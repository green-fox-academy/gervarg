import java.util.Scanner;

public class Exercise_01_DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner userinput = new Scanner(System.in);
    int numberToDivideWith = userinput.nextInt();
    divide(numberToDivideWith);


  }
  public static void divide(int divisionNumber){
    try {
      System.out.println(10 / divisionNumber);
    }
    catch (ArithmeticException e){
      System.out.println("Can't divide by zero");
    }
  }
}
