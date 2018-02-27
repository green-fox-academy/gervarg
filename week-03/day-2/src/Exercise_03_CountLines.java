import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise_03_CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    String pathname = "C:\\Users\\User\\Documents\\greenfox\\gervarg\\week-03\\day-2\\src\\my-file.txt";
    System.out.println(countLines(pathname));

  }
  public static int countLines(String fileName){
    Path path1 = Paths.get(fileName);
    try {
      List<String> lines = Files.readAllLines(path1);
      return lines.size();

    }
    catch (IOException e){
      return 0;
    }
  }
}
