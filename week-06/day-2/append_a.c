#include <stdio.h>
#include <stdlib.h>

// - Create a char array variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
// - Print the result of `appendAFunc(am)`

char* appendA(char *append_to, int size)
{

    char *new_array = (char*)calloc(size+1, sizeof(char));
    new_array = append_to;
    new_array[size-1] = 'a';
    return new_array;
}

int main()
{
    char am[] = "kuty";
    int size = sizeof(am) / sizeof(char);
	int i;
	char *appended = appendA(am, size);
	for (i = 0; i < size+1; i++){
        printf("%c", appended[i]);
	}
    return 0;
}
