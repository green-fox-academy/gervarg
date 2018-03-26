#include <stdio.h>
#include <stdlib.h>

int main()
{
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    int number_of_numbers;
    int sum = 0;
    float average;
    int numbers;
    printf("Give me how many numbers you wish to sum and average: ");
    scanf("%d", &number_of_numbers);
    printf("Give me the numbers: ");
    for(int i = 0; i < number_of_numbers; i++) {
        scanf("%d", &numbers);
        sum += numbers;
    }
    average = (float) sum / number_of_numbers;
    printf("The sum of numbers: %d , The average of numbers: %.2f" , sum, average);

    return 0;
}
