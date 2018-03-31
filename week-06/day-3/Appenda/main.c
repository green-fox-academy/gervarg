#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end

void append_a(char*, int);

int main()
{
	char nimals[3][8] = {"kuty", "macsk", "cic"};
	int size = sizeof(nimals) / sizeof(char);
	append_a(nimals, size);
    return 0;
}

void append_a(char *array, int size)
{
    //char *new_array[];
    int i;
    for (i = 0; i < size; i++) {
        int len = strlen(array[i]);
        array[len] = 'a';
        array[len+1] = '\0';
    }

}
