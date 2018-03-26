#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    int number;
    printf("Write in a number: ");
    scanf("%d", &number);
    if ( number % 2 == 1){
        printf("The number is odd.");
    }
    else {
        printf("The number is even.");
    }

    return 0;
}
