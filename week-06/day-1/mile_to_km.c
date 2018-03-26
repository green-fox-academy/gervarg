#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    int km;
    printf("Write the kilometer you want to convert to mile: ");
    scanf("%d" , &km);
    float km_to_mile = 0.621371192;
    printf("It is in miles: %0.2f", (float)km * km_to_mile);

    return 0;
}
