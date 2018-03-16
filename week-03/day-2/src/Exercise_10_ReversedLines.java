import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_10_ReversedLines {
  public static void main(String[] args) {
    List<String> decodedMessage = reverseLines("reversed-lines.txt");
    writeDecodedText("decoded.txt", decodedMessage);
  }

  private static void writeDecodedText(String newFile, List<String> messageToWrite) {
    Path filePath = Paths.get(newFile);
    try {
      Files.write(filePath, messageToWrite);
    } catch (IOException e) {
      System.out.println("Could not write to file");
    }
  }

  private static List<String> reverseLines(String fileName) {
    List<String> textToReverse = readFile(fileName);
    String result = "";
    for (int i = 0; i < textToReverse.size(); i++) {
      String temp = textToReverse.get(i);
      for (int j = temp.length() - 1; j >= 0; j--) {
        result += temp.charAt(j);
        textToReverse.set(i, result);
      }
      result = "";
    }
    return textToReverse;
  }

  private static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> fileText = new ArrayList<>();
    try {
      fileText = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Could not read file");
    }
    return fileText;
  }
}
