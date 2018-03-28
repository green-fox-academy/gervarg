#include <stdio.h>
#include <string.h>

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"

void write_multiple_lines(char*, char*, int);

int main()
{
    char filename[] = "my-file.txt";
    char word[] = "apple";
    int number = 5;
    write_multiple_lines(filename, word, number);
    return 0;
}

void write_multiple_lines(char *filename, char *word, int number_of_lines)
{
    FILE *fileptr;
    fileptr = fopen(filename, "w");
    int i;
    for (i = 0; i < number_of_lines; i++) {
        fprintf(fileptr, "%s\n", word);
    }
    fclose(fileptr);
}
