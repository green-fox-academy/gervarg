import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise_13_Lottery {
  public static void main(String[] args) {
    searchPopularNumbers("Lottery.csv");
  }

  private static void searchPopularNumbers(String fileName) {
    List<Integer> lottoNumbers = getLottoNumbers(fileName);
    Integer counter;
    List<Integer> occurences = new ArrayList<>();
    for (Integer number : lottoNumbers) {
      //TODO -> sorting numbers list and counting occurrences in different list
    }
  }

  public static List<Integer> getLottoNumbers(String fileName) {
    List<String> lotteryData = readFile(fileName);
    List<Integer> lottoNumbers = new ArrayList<>();
    for (String lines : lotteryData) {
      for (int i = 11; i < 16; i++) {
        lottoNumbers.add(Integer.valueOf(lines.split(";")[i]));
      }
    }
    return lottoNumbers;
  }

  private static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> text = new ArrayList<>();
    try {
      text = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Could not read file");
    }
    return text;
  }
}
