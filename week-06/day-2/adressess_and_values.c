#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Print out the addresses with and without pointer
//print out the values with and without pointer

int main()
{
    int number = 2017;
    float Pi = 3.14;
    char letter = 't';
    int *number_pointer = &number;
    float *Pi_pointer = &Pi;
    char *letter_pointer = &letter;
    printf("Addresses of number: %p, Pi: %p letter: %p\n", &number, &Pi, &letter);
    printf("Addresses of number: %p, Pi: %p letter: %p with pointers\n", number_pointer, Pi_pointer, letter_pointer);
    printf("Values of number: %d, Pi: %.2f letter: %c\n", number, Pi, letter);
    printf("Values of number: %d, Pi: %.2f letter: %c\n", *number_pointer, *Pi_pointer, *letter_pointer);
    return 0;
}
