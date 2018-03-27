#include <stdio.h>
#include <stdlib.h>

//Add two numbers using pointers

int main()
{
    int a = 20;
    int b = 17;
    int *a_pointer = &a;
    int *b_pointer = &b;
    int sum = *a_pointer + *b_pointer;
    printf("%d", sum);

    return 0;
}
