#include <stdio.h>
#include <math.h>
#include <stdlib.h>

// create two functions:
// first should create an array dynamically (the size should be a user input)
// second sould fill the array with random numbers

int *create_array(int);
void fill_array(int*, int);

int main()
{
    int number;
    printf("Give me the size of the array: ");
    scanf("%d", &number);
    int *array = create_array(number);
    fill_array(array, number);
    int i;
    for (i = 0; i < number; i++) {
        printf("%d\n", array[i]);
    }

    free(array);
    return 0;
}

int *create_array(int size)
{
    char *array = malloc(size);
    if (!array)
        return 0;
    return array;
}

void fill_array(int* array, int size)
{
    int i;
    for (i = 0; i < size; i++) {
        array[i] = rand() % 50;
    }
}
