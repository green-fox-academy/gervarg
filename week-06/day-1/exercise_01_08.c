#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello Gergely!\n");

    // Modify this program to print Humpty Dumpty riddle correctly
    printf("Humpty Dumpty sat on a wall,\n");
    printf("Humpty Dumpty had a great fall.\n");
    printf("All the king's horses and all the king's men\n");
    printf("Couldn't put Humpty together again.\n");

    // Greet 3 of your classmates with this program, in three separate lines
    // like:
    //
    // Hello, Esther!
    // Hello, Mary!
    // Hello, Joe!

    printf("Hello, Benji!\n");
    printf("Hello, Peti!\n");
    printf("Hello, Dave!\n");

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
    char name[] = "Gergely";
    int age = 33;
    float height = 1.89f;
    printf("%s\n", name);
    printf("%d\n", age);
    printf("%.02f\n\n", height);

    // Create a program that prints a few operations on two numbers: 22 and 13
    int number1 = 22;
    int number2 = 13;
    // Print the result of 13 added to 22
    printf("%d\n", number1 + number2);
    // Print the result of 13 substracted from 22
    printf("%d\n", number1 - number2);
    // Print the result of 22 multiplied by 13
    printf("%d\n", number1 * number2);
    // Print the result of 22 divided by 13 (as a decimal fraction)
    printf("%f\n", (float)number1 / number2);
    // Print the reminder of 22 divided by 13
    printf("%d\n\n", number1 % number2);

    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int weeks = 17;
    int working_days = 5;
    int coding_hours_inday = 6;
    int avarage_work_hours = 52;
    int all_coding_hours = weeks * working_days * coding_hours_inday;
    printf("%d\n", all_coding_hours);
    printf("Avarage coding hours during the course: %d %%\n\n", (int)((double) all_coding_hours / (weeks * avarage_work_hours) * 100));

    int favorite_number = 8;
    // Store your favorite number in a variable (as a number)
    // And print it like this: "My favorite number is: 8"
    printf("My favorite number is: %d\n\n", favorite_number);

     // Swap the values of the variables
    int a = 123;
    int b = 526;
    int temp;
    temp = a;
    a = b;
    b = temp;
    printf("%d\n", a);
    printf("%d\n", b);

    return 0;
}
