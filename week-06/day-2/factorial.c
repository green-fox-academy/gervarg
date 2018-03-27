#include <stdio.h>
#include <stdlib.h>

// - Create a function called `factorio`
//   that returns it's input's factorial

int factorio(int number)
{
    if (number == 0){
        return 1;
    } else {
        return factorio(number-1)*number;
    }
}

int main()
{
	int number_to_fact;
	printf("Give me a number to factorio: ");
	scanf("%d", &number_to_fact);
	printf("The value of the numbers factorial is: %d", factorio(number_to_fact));
    return 0;
}
