import java.util.Arrays;
import java.util.Scanner;

public class Exercise_22_PalindromeBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write a word to build a palindrome from it: ");
        String input = userInput.nextLine();
        palindromeBuilder(input);

    }

    private static void palindromeBuilder(String input) {
        char[] charsOfWord = input.toCharArray();
        char[] temp = new char[input.length()*2];
            int counter = 1;
            for (int i = 0; i <= charsOfWord.length - 1; i++) {
                temp[i+charsOfWord.length] = charsOfWord[(charsOfWord.length - counter)];
                temp[i] = charsOfWord[i];
                counter++;
            }
        System.out.println(temp);
    }
}

