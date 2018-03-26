#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    char star = '*';
    int i;
    for (i = 1; i <= 4; i++){
        for (int j = 0; j < i; j++){
            printf("%c", star);
        }
        printf("\n");
    }

    return 0;
}
