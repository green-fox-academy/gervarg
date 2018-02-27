import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Exercise_04_WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    List<String> lines = new ArrayList<>();
    lines.add("Varga Gergely");
    try {
      Path path1 = Paths.get("C:\\Users\\User\\Documents\\greenfox\\gervarg\\week-03\\day-2\\src\\my-file.txt");
      Files.write(path1, lines);

    }
    catch (IOException e){
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
