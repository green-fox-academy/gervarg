import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_05_WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    String pathname = "C:\\Users\\User\\Documents\\greenfox\\gervarg\\week-03\\day-2\\src\\my-file.txt";
    String word = "apple";
    int numberOfLines = 5;
    writeMultipleLines(pathname, word, numberOfLines);

  }
  public static void writeMultipleLines(String path, String word, int lines){
    Path path1 = Paths.get(path);
    List<String> wordsToAdd = new ArrayList<>();
    try {
      for (int i = 0; i < lines; i++) {
        wordsToAdd.add(word);
      }
      Files.write(path1, wordsToAdd);
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
}
