public class Anagram{

  private static boolean compare(String word1, String word2){
    char[] charArrayOfWord1 = word1.toLowerCase().toCharArray();
    char[] charArrayOfWord2 = word2.toLowerCase().toCharArray();
    if (charArrayOfWord1.length != charArrayOfWord2.length)
      return false;
    int[] counts = new int[26]; // An array to hold the number of occurrences of each character
    for (int i = 0; i < charArrayOfWord1.length; i++){
      counts[charArrayOfWord1[i]-97]++;  // Increment the count of the character at i
      counts[charArrayOfWord2[i]-97]--;  // Decrement the count of the character at i
    }
    // If the strings are anagrams, the counts array will be full of zeros
    for (int i = 0; i<26; i++)
      if (counts[i] != 0)
        return false;
    return true;
  }

  public static void main(String[] args){
    System.out.println(compare(args[0], args[1]));
  }
}