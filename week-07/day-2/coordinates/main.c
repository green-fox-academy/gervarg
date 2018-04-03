#include <stdio.h>
#include <math.h>

// Create a struct to store coordinates (for example: int x and int y)
// Create an array which can store coordinates, do not create multidimensonal arrays here
// Fill up the coordinates in the array with random number.

typedef struct {
    int x;
    int y;
}coordinates;

int main()
{
    coordinates my_coordinates[3];
    int i;
    for (i = 0; i < 3; i++) {
        my_coordinates[i].x = rand();
        my_coordinates[i].y = rand();
        printf("x: %d, y: %d\n", my_coordinates[i].x, my_coordinates[i].y);
    }
	return 0;
}
