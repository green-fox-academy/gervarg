#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`

int main()
{
	int af[] = {4, 5, 6, 7};
	int i;
	for(i = 0; i < 4; i++){
        printf("%d\n", af[i]);
	}
    return 0;
}
