#include <stdio.h>
#include <stdlib.h>

// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - parameter should be a pointer to the variable you want to double


//solution1:
void doubling(int* number)
{
    *number *= 2;
}

//solution2
/*int doubling(int* number)
{
    *number *= 2;
    return *number;
}*/

int main()
{
	int number_to_double;
	printf("Give me the number to double: ");
	scanf("%d", &number_to_double);
	int *number_pointer = &number_to_double;
	doubling(number_pointer);
	printf("The doubled number: %d", number_to_double);
    return 0;
}
