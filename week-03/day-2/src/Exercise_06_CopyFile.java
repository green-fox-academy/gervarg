import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise_06_CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String pathname = "C:\\Users\\User\\Documents\\greenfox\\gervarg\\week-03\\day-2\\src\\my-file.txt";
    String newFile = "copied_file.txt";
    System.out.println(copyFile(pathname, newFile));
  }

  private static boolean copyFile(String fileToCopy, String newCopiedFile) {
    Path path1 = Paths.get(fileToCopy);
    Path path2 = Paths.get(newCopiedFile);
    try {
      Files.copy(path1, path2);
      return true;
    }
    catch (IOException e){
      return false;
    }
  }
}
