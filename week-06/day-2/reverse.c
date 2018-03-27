#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

void reverse(int* array, int size)
{
    int i, j;
    int *temp;
    temp = (int*)calloc(size, sizeof(int));
    for (i = size-1, j = 0; i >= 0; i--, j++) {
        *(temp+j) = *(array + i);
    }
    for (i = 0; i < size; i++) {
        *(array+i) = *(temp+i);
    }
}

int main()
{
	int aj[] = {3, 4, 5, 6, 7};
	int size = sizeof(aj) / sizeof(int);
	reverse(aj, size);
	int i;
	for (i = 0; i < 5; i++) {
        printf("%d\n", aj[i]);
	}
    return 0;
}
