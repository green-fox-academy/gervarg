#include <stdio.h>
#include <stdlib.h>

// - Create a char array variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

void greeting(char *array)
{
    printf("Greetings dear, %s", array);
}

int main()
{
	char al[] = "Greenfox";
	greeting(al);
    return 0;
}
