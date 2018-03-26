#include <stdio.h>
#include <stdlib.h>

int main()
{

    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    int number_stored = 8;
    int input_number;
    printf("Guess the number: ");
    scanf("%d", &input_number);
    while (input_number != number_stored) {
        if(input_number > number_stored) {
            printf("The stored number is lower\n");
        } else if (input_number < number_stored){
            printf("The stored number is higher\n");
        }
        scanf("%d", &input_number);
    }
    printf("You have found the number!");
    return 0;
}
