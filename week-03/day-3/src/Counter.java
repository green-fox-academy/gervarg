public class Counter {
  private int value = 0;

  public Counter(){

  }

  public Counter(int value){
    this.value= value;
  }

  public void add(int number){
    value += number;
  }
  public void add(){
    value++;
  }
  public int get(){
    return value;
  }
  public void reset(){
    value = 0;
  }

}
