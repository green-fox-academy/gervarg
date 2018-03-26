#include <stdio.h>
#include <stdlib.h>

int main()
{
    int current_hours = 14;
    int current_minutes = 34;
    int current_seconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    int remaining_seconds = (24*60*60) - ((current_hours * 60) + (current_minutes * 60) + current_seconds);
    printf("The remaining seconds in a day: %d", remaining_seconds);

    return 0;
}
