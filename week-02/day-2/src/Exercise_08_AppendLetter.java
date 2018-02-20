import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_08_AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static String appendA(List<String> appendingA){
        for (int i = 0; i < appendingA.size() ; i++) {
            appendingA.set(i, appendingA.get(i)+"a");
        }
        return appendingA.toString();
    }
}
