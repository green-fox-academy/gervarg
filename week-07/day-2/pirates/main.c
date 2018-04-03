#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

/*
Create a struct that represents a pirate
It should store:
 - name
 - an int value which tells us if he/she has a wooden leg?
 - gold count
Create a function that takes an array of pirates (and it's length) then returns the sum of the golds of all pirates
Create a function that takes an array of pirates (and it's length) then returns the average of the gold / pirate
Create a function that takes an array of pirates (and it's length) then returns the name of the
richest that has wooden leg
*/

typedef struct {
    char name[256];
    int has_wooden_leg;
    short int gold_count;
} Pirate;

int pirate_booty(Pirate *pirates, int size)
{
    int i;
    int sum = 0;
    for (i = 0; i < size; i++) {
        sum += pirates[i].gold_count;
    }
    return sum;
}

double average_booty(Pirate *pirates, int size)
{
    double average;
    int sum = pirate_booty(pirates, size);
    average = (double)sum / size;
    return average;
}

char *richest_skallyvag(Pirate *pirates, int size)
{
    int i;
    int max_location = -1;
    int most_gold = pirates[0].gold_count;
    for (i = 0; i < size; i++){
        if (pirates[i].gold_count >= most_gold && pirates[i].has_wooden_leg == 1) {
            most_gold = pirates[i].gold_count;
            max_location = i;
        }
    }
    return (max_location > -1) ? pirates[max_location].name : "There is no such pirate";
}

int main()
{
    srand(time(NULL));
    Pirate pirates[3];
    strcpy(pirates[0].name, "Long John Silver");
    strcpy(pirates[1].name, "Black Beard");
    strcpy(pirates[2].name, "Davy Jones");
    int i;
    for (i = 0; i < 3; i++) {
        pirates[i].gold_count = rand() % 50;
        pirates[i].has_wooden_leg = rand() % 2;
    }
    printf("The treasure amount of all pirates is: %d gold\n", pirate_booty(pirates, 3));
    printf("The average gold of a pirate is: %f gold\n", average_booty(pirates, 3));
    printf("The richest pirate who has a wooden leg is: %s", richest_skallyvag(pirates, 3));

    return 0;
}
