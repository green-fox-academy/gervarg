#include <stdio.h>
#include <string.h>

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file

int count_lines(char*);

int main ()
{
    char filename[] = "my-file.txt";
    printf("number of lines: %d", count_lines(filename));
    return 0;
}

int count_lines(char *filename)
{
    FILE *fileptr;
    char lines[100];
    int line_number = 0;
    fileptr = fopen(filename, "r");
    if (fileptr == NULL) {
        printf("Could not read file\n");
        return 0;
    } else {
        while (!feof(fileptr)) {
            fgets(lines, 100, fileptr);
            line_number++;
        }
        return line_number;
    }
}
