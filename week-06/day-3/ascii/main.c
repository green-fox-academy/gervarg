#include <stdio.h>

// print out the ascii values of the array

int main()
{
    int array[] = { 103, 114, 101, 101, 110, 32, 102, 111, 120};
    int i;
    for (i = 0; i < 9; i++){
        printf("%c", (char)array[i]);
    }

    return 0;
}
