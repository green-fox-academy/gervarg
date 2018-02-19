
//still trying to solve this problem
public class Exercise_20_Unique {
    public static void main(String[] args){
                //  Create a function that takes a list of numbers as a parameter
                //  Returns a list of numbers where every number in the list occurs only once

                //  Example
                System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
                //  should print: `[1, 11, 34, 52, 61]`
    }
    public static int[] unique(int[] numberList){
        int testNumber = numberList[0];
        int counter = 0;
        int[] uniqueArray = new int[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] == testNumber) {
                counter++;
            } else {
                for (int j = 0; j < numberList.length-counter ; j++) {
                    uniqueArray[j] = numberList[i];
                    testNumber = numberList[i];
                }
            }
        }
        return uniqueArray;
    }
}
