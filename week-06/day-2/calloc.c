#include <stdio.h>
#include <stdlib.h>

// with calloc
// please allocate a 10 long array and fill it with 5!! numbers from 0 to 4, then print the whole array
// please delete the array before the program exits
// what's the difference between this and the previous excersice?

int main()
{
    int* pointer = NULL;
    pointer = (long*)calloc(10, sizeof(long));
    //calloc() zero-initializes the buffer,
    //while malloc() leaves the memory uninitialized.
    int i;
    for (i = 0; i < 5; i++){
        pointer[i] = i;
        printf("%d\n", pointer[i]);
    }
    free(pointer);
    return 0;
}
