#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// lists all position where character 'i' is found

void position(char*);

int main ()
{
	char string[55] = "This is a string for testing";
	position(string);
	return 0;
}

void position(char *string)
{
    printf ("Looking for the 'i' character in \"%s\"...\n",string);
    char *p;
    p = strchr(string, 'i');
    while (p != NULL) {
        printf("found at %d\n",p-string+1);
        p = strchr(p+1, 'i');
    }
}
