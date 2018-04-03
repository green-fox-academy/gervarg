#include <stdio.h>

// Write a function called "GetSurface" that takes a RectangularCuboid
// and returns it's surface
// Write a function called "GetVolume" that takes a RectangularCuboid
// and returns it's volume

typedef struct{
    double a;
    double b;
    double c;
}rectangular_cuboid;

double get_surface(rectangular_cuboid cuboid)
{
    return 2 * (cuboid.a * cuboid.b + cuboid.a * cuboid.c + cuboid.b * cuboid.c);
}

double get_volume(rectangular_cuboid cuboid)
{
    return cuboid.a * cuboid.b * cuboid.c;
}

int main()
{
    rectangular_cuboid rect;
    rect.a = 4.3;
    rect.b = 5.2;
    rect.c = 5.57;
    printf("The surface of the cuboid is: %.3f, The volume is: %.3f", get_surface(rect), get_volume(rect));
    return 0;
}
