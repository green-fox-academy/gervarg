#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

int main()
{
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.
    // But this time use only switch case!

    int i;
    for (i = 1; i <= 100; i++){
        int b = i % 15;
        switch(b){
        case 0:
        printf("FizzBuzz\n");
        break;
        case 3:
        printf("Fizz\n");
        break;
        case 5:
        printf("Buzz\n");
        break;
        case 6:
        printf("Fizz\n");
        break;
        case 9:
        printf("Fizz\n");
        break;
        case 10:
        printf("Buzz\n");
        break;
        case 12:
        printf("Fizz\n");
        break;
        default:
        printf("%d\n", i);
        break;
        }
    }


    return 0;
}
