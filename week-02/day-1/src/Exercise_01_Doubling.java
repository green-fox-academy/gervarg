public class Exercise_01_Doubling {
    public static void main(String[] args) {
        int ak = 123;
        System.out.println(doubling(ak));
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`
    }
    public static int doubling(int numberToDouble){
        numberToDouble *= 2;
        return numberToDouble;
    }
}