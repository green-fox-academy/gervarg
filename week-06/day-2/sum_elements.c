#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

int main()
{
	int r[] = {54, 23, 66, 12};
	int i;
	int sum;
	for (i = 0; i < 4; i++){
        sum += r[i];
	}
	printf("The sum is: %d", sum);
    return 0;
}
