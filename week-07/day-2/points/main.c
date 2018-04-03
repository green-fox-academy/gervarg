#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
Create a point struct which has two float variables: x and y
Create a function that constructs a point
It should take it's x and y coordinate as parameter
Create a function that takes 2 points and returns the distance between them
Example:
int main()
{
	point_t p1 = create_point(1, 1);
	point_t p2 = create_point(1, 5.5);
	float dist = distance(p1, p2);
	printf("%f", dist);
	return 0;
}
*/

typedef struct {
    float x;
    float y;
} point;

point create_point(float x, float y)
{
    point this_point;
    this_point.x = x;
    this_point.y = y;
    return this_point;
}

float distance(point p1, point p2)
{
    float dx = p1.x - p2.x;
    float dy = p1.y - p2.y;
    float dist;
    dist = sqrt((dx * dx) + (dy * dy));
    return dist;
}


int main()
{
	point p1 = create_point(6,1);
    point p2 = create_point(1, 5.5);
    printf("The distance between p1 and p2 is: %.2f", distance(p1, p2));
	return 0;
}
