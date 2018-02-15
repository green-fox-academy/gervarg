public class Types {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        int age = 33;
        double height = 1.89;
        String name = "Varga Gergely";
        System.out.println( age + "\n" + height + "\n" + name );
        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22;
        int b = 13;
        // Print the result of 13 added to 22
        System.out.println(a+b);
        // Print the result of 13 substracted from 22
        System.out.println(a-b);
        // Print the result of 22 multiplied by 13
        System.out.println(a*b);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println((double)(a/b));
        // Print the integer part of 22 divided by 13
        System.out.println(a/b);
        // Print the reminder of 22 divided by 13
        System.out.println(a%b);
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int workinghours = 17*5*6;
        System.out.println("Hours spent coding during the course: " + workinghours);
        double avarage = (workinghours/(double)(17*52))*100;
        System.out.println("Avarage coding hours during the course: " + (int)avarage +"%" );



    }
}
