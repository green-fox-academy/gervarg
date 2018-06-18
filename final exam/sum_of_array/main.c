#include <stdio.h>
#include <stdlib.h>

float sum_of_array(float *array, int size);
//Create a function that takes an array of float numbers and returns with the sum of those numbers

int main()
{
    int size;
    printf("Give me the size of the array: ");
    scanf("%d", &size);
    float numbers[size];
    printf("Give me the numbers (float) you want to sum: \n");
    for (int i = 0; i < size; i++) {
        scanf("%f", &numbers[i]);
    }
    //float numbers[] = {2.3, 3.4, 5.6, 7.8};
    //int size = sizeof(numbers) / sizeof(float);
    printf("The sum of the given array is: %.2f\n", sum_of_array(numbers, size));
    return 0;
}

float sum_of_array(float *array, int size)
{
    float sum = 0;
    for (int i = 0; i < size; i++)
        sum += array[i];
    return sum;
}
