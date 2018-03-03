package Exercise_08_Counter;

public class Counter {
  private int value;
  private int initValue;

  public Counter() {
    this.value = 0;
    this.initValue = 0;

  }

  public Counter(int value) {
    this.value = value;
    this.initValue = value;
  }

  public void add(int number) {
    value += number;
  }

  public void add() {
    value++;
  }

  public int get() {

    return value;
  }

  public void reset() {
    value = initValue;
  }

}
