#include <stdio.h>
#include <string.h>

// create a program which asks for full name and age
// and stores it in a char array
// parse that array to first_name, last_name, age (use tokenizing)
// print out the the stored variables
// example:
//   printf("Your name is: %s %s and you are %d years old", first_name, last_name, age);

int main ()
{
    char user_data[200] = "Gergely Varga 33";
    char *first_name = strtok(user_data, " ");
    char *last_name = strtok(NULL, " ");
    int age = atoi(strtok(NULL, " "));

    printf("Your name is: %s %s and you are %d years old", first_name, last_name, age);
    return 0;
}
