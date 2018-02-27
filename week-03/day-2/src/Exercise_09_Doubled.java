import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_09_Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path message = Paths.get("duplicated-chars.txt");
    Path newMessage = Paths.get("single-chars.txt");
    try {
      List<String> text = Files.readAllLines(message);
      Files.copy(message, newMessage);
      Files.write(newMessage, decrypter(text));
    }
    catch (IOException e){
      e.printStackTrace();
    }

  }
  public static List<String> decrypter(List<String> textToDecrypt){
    String writeString = "";
    List<String> decryptedMessage = new ArrayList<>();
    for (String textLine: textToDecrypt) {
      for (int i = 0; i < textLine.length(); i+=2) {
        writeString += textLine.charAt(i);
      }
      System.out.println(writeString += "\n");
    }
    decryptedMessage.add(writeString);
    return decryptedMessage;
  }
}
