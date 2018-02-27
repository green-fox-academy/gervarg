import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_08_Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    Path pathLog = Paths.get("log.txt");
    try {
      List<String> logText = Files.readAllLines(pathLog);
      uniqueAdresses(logText);
      System.out.println(requestRatio(logText));
    }
    catch (IOException e){
      e.printStackTrace();
    }
  }
  public static Object uniqueAdresses(List<String> adresses){
    ArrayList<String> ipAdress = new ArrayList<>();
    for (int i = 0; i < adresses.size(); i++) {
      ipAdress.add(i, adresses.get(i).substring(27,38));

    }
    Set<String> uniquefilter = new HashSet<>();
    uniquefilter.addAll(ipAdress);
    Object[] uniqueAdress = uniquefilter.toArray();
    return uniqueAdress;
  }
  public static double requestRatio(List<String> requestList){
    ArrayList<String> post = new ArrayList<>();
    ArrayList<String> get = new ArrayList<>();
    for (int i = 0; i < requestList.size(); i++) {
      if (requestList.get(i).contains("GET")){
        get.add(requestList.get(i));
      }
      else if (requestList.get(i).contains("POST")){
        post.add(requestList.get(i));
      }
    }
    double ratio = (double)get.size()/post.size();
    return ratio;
  }
}
