#include <stdio.h>
#include <stdlib.h>
#include "pi_header.h"

// define a variable called PI with the value of 3.14
// create a function which takes the radius of a circle as a parameter
// and return the area of that cirle
// area = radius * radius * PI

float circle_area(int radius)
{
    return radius * radius * PI;
}

int main()
{
    int radius = 3;
    printf("%.2f", circle_area(radius));
	return 0;
}
