#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter,
// and splits a string to words by space
// solve the problem with the proper string.h function

void sentence(char*);

int main()
{
    //i just don't get it why this doesn't work
    printf("Type in a sentence:\n\n");
    char string[256];
    gets(string);
    sentence(string);
    return(0);
}

void sentence(char *string)
{
    char *word = strtok(string, " ");
    while (word != NULL) {
        printf("%s\n", word);
        word = strtok(NULL, " ");
    }
}
