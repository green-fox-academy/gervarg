import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_11_ReversedOrder {
  public static void main(String[] args) {
    List<String> decodedMessage = reverseOrder("reversed-order.txt");
    writeDecodedText("decodedOrder.txt", decodedMessage);
  }

  private static List<String> reverseOrder(String fileName) {
    List<String> fileText = fileRead(fileName);
    List<String> reversedText = new ArrayList<>();
    for (int i = fileText.size() - 1; i >= 0; i--) {
      reversedText.add(fileText.get(i));
    }
    return reversedText;
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
