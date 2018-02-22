import java.util.Arrays;
import java.util.Scanner;

public class Exercise_21_Anagram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input1 = userInput.nextLine();
        String input2 = userInput.nextLine();
        anagram(input1, input2);

    }

    private static void anagram(String input1, String input2) {
        char[] charsOfFirstWord = input1.toCharArray();
        char[] charsOfSecondWord = input2.toCharArray();
        char[] temp = new char[input2.length()];
        if (charsOfFirstWord.length == charsOfSecondWord.length) {
            int counter = 1;
            for (int i = 0; i <= charsOfFirstWord.length - 1; i++) {
                temp[i] = charsOfSecondWord[(charsOfFirstWord.length - counter)];
                counter++;
            }
            anagramcheck(temp, charsOfFirstWord);
        } else {
            System.out.println("The length of the two words don't match!");
        }
    }
    private static void anagramcheck(char[] temp, char[] charsOfFirstWord) {
        if (Arrays.equals(temp, charsOfFirstWord)){
            System.out.println("The words you typed are anagrams!");
        }
        else {
            System.out.println("The words aren't anagrams!");
        }
    }
}
