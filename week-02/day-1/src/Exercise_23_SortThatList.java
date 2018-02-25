import java.util.Arrays;

public class Exercise_23_SortThatList {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `True` sort that list descending

    //  Example:
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }
  public static String bubble(int[] listToSort){
    int temp= 0;
    for (int i = listToSort.length-1; i > 0 ; i--) {
      for (int j = 0; j < i; j++) {
        if (listToSort[j] < listToSort[j+1]){
          temp = listToSort[j];
          listToSort[j] = listToSort[j+1];
          listToSort[j+1] = temp;
        }
      }
    }
    return Arrays.toString(listToSort);
  }

  public static String advancedBubble(int[] listToSortAdvanced, boolean isItTrue){
    int temp = 0;
    for (int i = listToSortAdvanced.length-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if(listToSortAdvanced[j] > listToSortAdvanced[j+1] && isItTrue){
          temp = listToSortAdvanced[j+1];
          listToSortAdvanced[j+1] = listToSortAdvanced[j];
          listToSortAdvanced[j] = temp;
        }
      }
    }
    return Arrays.toString(listToSortAdvanced);
  }
}