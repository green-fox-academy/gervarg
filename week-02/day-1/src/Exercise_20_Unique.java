import java.util.Arrays;

//still trying to solve this problem
public class Exercise_20_Unique {
    public static void main(String[] args){
                //  Create a function that takes a list of numbers as a parameter
                //  Returns a list of numbers where every number in the list occurs only once
                //  Example
                System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
                //  should print: `[1, 11, 34, 52, 61]`
    }
    public static String unique(int[] numberList) {
        int testNumber;
        int counter = 0;
        int[] uniqueArray = new int[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            testNumber = numberList[i];
            int tester = 0;
            for (int j = 0; j < numberList.length; j++) {
                if (uniqueArray[j] != testNumber) {
                    tester++;
                }
            }
            if (tester == numberList.length) {
                uniqueArray[counter] = testNumber;
                counter++;
            }
        }
        int[] uniqueArrayFinal = new int[counter];
        for (int k = 0; k < counter; k++) {
            uniqueArrayFinal[k] = uniqueArray[k];
            System.out.println(uniqueArrayFinal[k]);
        }
        return Arrays.toString(uniqueArrayFinal);
    }
}

