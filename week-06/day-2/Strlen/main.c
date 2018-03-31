#include <stdio.h>
#include <stdlib.h>

// Create a function which receives a string as parameter, and returns
// the numbers of characters in the string.
// Don't use the strlen() function!

int string_length(char*, int);

int main()
{
    char input_string[256];
    printf("Enter the string which length you want to know: ");
    gets(input_string);
    int size = sizeof(input_string) / sizeof(char);
    printf("The length of the string is: %d", string_length(input_string, size));
    return 0;
}

int string_length(char *string, int size)
{
    int counter = 0;
    int i;
    for (i = 0; i < size; i++){
        if (string[i] == '\0')
            break;
        counter++;
    }
    return counter;
}
