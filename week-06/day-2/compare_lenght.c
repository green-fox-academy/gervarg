#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

int main()
{
	int p1[] = {1, 2, 3};
	int p2[] = {4, 5};
	int sizep1 = sizeof(p1) /  sizeof(int);
	int sizep2 = sizeof(p2) / sizeof(p2[0]);

	if (sizep2 > sizep1){
        printf("p2 has more elements than p1");
	} else {
        printf("p1 has more elements than p2");
	}
    return 0;
}
