#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// returns the distance between the first and last occurance of character 's'

int distance(char*);

int main ()
{
    char str[] = "This is a sample string";
    printf("%d", distance(str));
    return 0;
}

int distance(char *sentence)
{
    char *first, *last;
    first = strchr(sentence, 's');
    last = strrchr(sentence, 's');
    int distance;
    distance = (int)last - (int)first;
    return distance;
}
