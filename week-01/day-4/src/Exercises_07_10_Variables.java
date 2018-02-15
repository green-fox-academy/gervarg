public class Variables {
    public static void main(String[] args) {
        int favorite_number = 8;
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
        System.out.println("My favorite number is: " + favorite_number);
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean
        String name = "Gergely Varga";
        int age = 33;
        double height = 1.89;
        boolean married = true;
        System.out.println("Name: " + name + " Age: " + age + " Height: " + height + " Married: " + married);
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI;
        // Print the Body mass index (BMI) based on these values
        BMI = massInKg / (heightInM*heightInM);
        System.out.println(BMI);

        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
