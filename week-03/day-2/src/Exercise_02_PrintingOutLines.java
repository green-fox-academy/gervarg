import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Exercise_02_PrintingOutLines {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    String pathstring = "my-file.txt";
    Path path1 =  Paths.get("C:\\Users\\User\\Documents\\greenfox\\gervarg\\week-03\\day-2\\src\\my-file.txt");
    //File file1 = new File(pathstring);
    try {
      List<String> lines = Files.readAllLines(path1);
      for (int i = 0; i < lines.size(); i++) {
       System.out.println(lines.get(i));
        }

    }
    catch (IOException e){
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
