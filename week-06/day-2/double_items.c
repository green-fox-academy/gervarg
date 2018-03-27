#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Create a function that takes an array as a parameter and,
//   double all the values in the original array
// - Example:
//   int array[] = {0, 32, 5, 71, 91};
//   double_items(array);
//   printf("%d\n", array[1]); // should print out 64

void double_items(int *array, int size)
{
    int i;
    for (i = 0; i < size; i++) {
        array[i] *= 2;
    }
}

int main()
{
	int ag[] = {3, 4, 5, 6, 7};
	int size = sizeof(ag) / sizeof(int);
	double_items(ag,size);
	printf("%d\n", ag[1]);
    return 0;
}
