#include <stdio.h>
#include <stdlib.h>

// please allocate a 10 long array and fill it with even numbers
// please allocate a 10 long array and fill it with odd numbers
// select an array, and push the elements into the another array
// print it the array in descending order
// delete the arrays after you don't use them

int main()
{
    int* pointer = NULL;
    int* pointer2 = NULL;
    pointer = (int*) malloc(10 * sizeof(int));
    pointer2 = (int*) malloc(10 * sizeof(int));
    int i;
    int j;
    for (i = 0; i < 10; i++){
        pointer[i] = 2 * i;
        printf("%d\n", pointer[i]);
        }
    printf("\n\n");
    for (j = 0; j < 10; j++){
        pointer2[j] = 2 * j + 1;
        printf("%d\n", pointer2[j]);
        }
    printf("\n\n");
    pointer2 = realloc(pointer2, 24);
    int k;
    for (k = 10; k < 20; k++){
            pointer2[k] = pointer[k-10];
            printf("%d\n", pointer2[k]);
            printf("%d\n", pointer2[k-10]);
         }
    printf("\n\n");
    int m;
    for (m = 19; m >= 0; m--){
        printf("%d\n", pointer2[m]);
    }

    free(pointer);
    free(pointer2);

    return 0;
}
