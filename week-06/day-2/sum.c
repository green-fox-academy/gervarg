#include <stdio.h>
#include <stdlib.h>

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

int sum(int number)
{
    int i;
    int sum;
    for (i = 1; i <= number; i++){
        sum += i;
    }
    return sum;
}

int main()
{
	int number;
	printf("Give me a number until you want to sum: ");
	scanf("%d", &number);
	printf("%d" , sum(number));

    return 0;
}
