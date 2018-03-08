package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> numbers;

  public Sum(){
    this.numbers = new ArrayList<>();
  }

  public int sumNumbers(List<Integer> numbers){
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }
}
