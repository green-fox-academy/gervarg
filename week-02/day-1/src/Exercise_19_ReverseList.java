public class Exercise_19_ReverseList {
    public static void main(String[] args){
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
        int[] aj = {3, 4, 5, 6, 7};
        reverse(aj);


    }

    private static void reverse(int[] reverseArray) {
        for (int i = reverseArray.length-1; i >= 0 ; i--) {
            System.out.println(reverseArray[i]);
        }
    }
}

