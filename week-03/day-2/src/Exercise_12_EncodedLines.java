import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_12_EncodedLines {
  public static void main(String[] args) {
    List<String> decodedMessage = decodeFile("encoded-lines.txt");
    writeDecodedText("decodedFile.txt", decodedMessage);

  }

  private static List<String> decodeFile(String fileName) {
    List<String> encodedText = fileRead(fileName); // i need ansi value -1
    String lines;
    String decodedLines = "";
    char whiteSpace = 32;
    for (int i = 0; i < encodedText.size(); i++) {
      lines = encodedText.get(i);
      for (int j = 0; j < lines.length(); j++) {
        if (lines.charAt(j) != whiteSpace) {
          decodedLines += (char) (lines.charAt(j) - 1);
        } else {
          decodedLines += " ";
        }
      }
      encodedText.set(i, decodedLines);
      decodedLines = "";
    }
    return encodedText;
  }

  private static List<String> fileRead(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> text = new ArrayList<>();
    try {
      text = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Could not read file");
    }
    return text;
  }

  private static void writeDecodedText(String newFile, List<String> messageToWrite) {
    Path filePath = Paths.get(newFile);
    try {
      Files.write(filePath, messageToWrite);
    } catch (IOException e) {
      System.out.println("Could not write to file");
    }
  }
}
