#include <stdio.h>

// print the memory address of the variable

int main()
{
    int number = 1234;
    printf("%p", &number);
    return 0;
}
