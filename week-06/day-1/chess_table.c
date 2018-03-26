#include <stdio.h>
#include <stdlib.h>

int main()
{

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
    int size;
    printf("Give me the size of the table: ");
    scanf("%d", &size);
    for(int i = 1; i <= size; i++) {
        for(int j = 0; j < size; j++) {
            if(j % 2 == 0){
                printf("%%");
            } else {
                printf(" ");
            }
        }
        printf("\n");
        if( i % 2 == 1){
            printf(" ");
        }
    }
    return 0;
}
