#include <string.h>
#include <stdio.h>
#include <time.h>
#include <stdlib.h>


/* Write a car register!
 * You should store the following data in a structure, called "car":
 *  - the manufacturer's name (which is shorter than 256 characters)
 *  - the price of the car (in euros, stored as a floating point number)
 *  - the year of manufacture
 *  - the type of the transmission (as a custom type, see below)
 *
 * You should store the transmission type in an enumeration ("transmission"),
 * the valid types are:
 *  - manual
 *  - automatic
 *  - CVT
 *  - semi-automatic
 *  - dual-clutch
 *
 * The "car"-s are stored in an array.
 *
 * Write the following functions:
 *  - get_older_cars_than(struct car* array, int array_length, int age)
 *      - it returns the count of the older cars than "age"
 *  - get_transmission_count(struct car* array, int array_length, enum transmission trnsm)
 *      - it returns the count of cars which has "trnsm" transmission
 */


 enum transmission {
    manual,
    automatic,
    CVT,
    semi_automatic,
    dual_cluth
 };

 typedef struct {
    char manufacturer[256];
    float price;
    int year_of_manufact;
    enum transmission type;
 } car;

 int get_oldercars_than(car *cars, int array_length, int age)
 {
     int counter = 0;
     int i;
     for (i = 0; i < array_length; i++)
        if (2018 - cars[i].year_of_manufact > age)
            counter++;
     return counter;
 }

 int get_transmission_count(car *cars, int array_length,enum transmission trsnm_type)
 {
     int i;
     int counter = 0;
     for (i = 0; i < array_length; i++)
        if (cars[i].type == trsnm_type)
            counter++;
     return counter;
 }

int main()
{
    srand(time(NULL));
    car cars[4];
    strcpy(cars[0].manufacturer, "Ferrari");
    strcpy(cars[1].manufacturer, "Porsche");
    strcpy(cars[2].manufacturer, "Lamborghini");
    strcpy(cars[3].manufacturer, "Tesla");
    int i;
    for (i = 0; i < 4; i++) {
        cars[i].year_of_manufact = rand() % (2018 + 1 - 1976) + 1976;
        cars[i].type = rand() % 5;
    }
    int age = 20;
    printf("The number of cars older than 20 years: %d\n", get_oldercars_than(cars, 4, age));
    printf("The number of cars with automatic transmission: %d\n", get_transmission_count(cars, 4, automatic));
    return 0;
}
