#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
    int number;
    printf("Write a number: ");
    scanf("%d", &number);
    if ( number <= 0){
        printf("Not enough");
    } else if ( number == 1){
        printf("One");
    } else if ( number == 2){
        printf("Two");
    } else {
        printf("A lot");
    }
    return 0;
}
