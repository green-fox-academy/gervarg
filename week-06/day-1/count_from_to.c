#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
    int first_number;
    int second_number;
    printf("Give me two numbers: ");
    scanf("%d %d", &first_number, &second_number);
    if (second_number <= first_number){
        printf("The second number should be bigger");
    } else {
        for (int i = first_number; i < second_number; i++){
            printf("%d\n", i);
        }
    }

    return 0;
}
