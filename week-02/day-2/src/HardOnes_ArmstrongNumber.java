import java.util.Scanner;

public class HardOnes_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type in a number you want to check if it is an Armstrong number: ");
        Integer numberToTest = userInput.nextInt();
        System.out.println(armstrongNumber(numberToTest));
    }

    public static boolean armstrongNumber(int testNumber){
        int sumOfPower = 0;
        int digits = checkDigits(testNumber);
        int[] singleDigits = getIntArrayOfNumber(testNumber);
        for (int i = 0; i < singleDigits.length ; i++) {
            sumOfPower += Math.pow(singleDigits[i], digits);
        }
        return sumOfPower == testNumber;
    }

    private static int[] getIntArrayOfNumber(int testNumber) {
        String convert = Integer.toString(testNumber);
        int[] numbersArray = new int[convert.length()];
        for (int i = 0; i < convert.length() ; i++) {
                 numbersArray[i] = Character.getNumericValue(convert.charAt(i));
        }
        return numbersArray;
    }

    private static int checkDigits(Integer testNumber) {
        String checker = Integer.toString(testNumber);
        int digits = checker.length();

        //the other way
        /*int digits = 0;
        do {
            int i = 10;
            testNumber = testNumber /10;
            digits++;
        } while (testNumber > 0);*/
        return digits;
    }
}
