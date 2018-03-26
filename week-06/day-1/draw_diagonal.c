#include <stdio.h>
#include <stdlib.h>

int main()
{
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
    int square_side;
    printf("Give me the size of the square: ");
    scanf("%d", &square_side);
    int i;
    for(i = 0; i < square_side; i++){
        for(int j = 0; j < square_side; j++){
            if(i == 0 || j == 0 || j == square_side - 1 || i == square_side - 1 || i == j){
                printf("%%");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
