public class Exercise_02_GreeterFunction {
    public static void main(String[] args){
        String al = "Greenfox";
        // - Create a string variable named `al` and assign the value `Greenfox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Greenfox`
        // - Greet `al`
        System.out.println(greet(al));
    }
    public static String greet(String Greeting){
        Greeting = "Greeting dear, " + Greeting;
        return Greeting;
    }

}
