#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

/*
Create a struct that represents a House
It should store:
 - The address of the house
 - The price in EUR
 - The number of rooms
 - The area of the house in square meters
The market price of the houses is 400 EUR / square meters
Create a function that takes a pointer to a house and decides if it's worth to buy
(if the price is lower than the calculated price from it's area)
Create a function that takes an array of houses (and it's length), and counts the
houses that are worth to buy.
*/

typedef struct {
    char address[50];
    double price;
    double area;
    int rooms;
} house;

const int MAX_AREA = 1400;
const int MIN_AREA = 150;
const int MAX_PRICE = 800000;
const int MIN_PRICE = 60000;

int evaluate_house(house this_house)
{
    double price_parea = this_house.price / this_house.area;
    if (price_parea < 400)
        return 1;
    else
        return 0;
}

int houses_worth_tobuy(house *houses, int size)
{
    int counter = 0;
    int i;
    for (i = 0; i < size; i++) {
        if (evaluate_house(houses[i]) == 1)
            counter++;
    }
    return counter;
}

int main()
{
    house castles[3];
    int i;
    for (i = 0; i < 3; i++){
        castles[i].area = rand() % (MAX_AREA + 1 - MIN_AREA) + MIN_AREA;
        castles[i].price = rand() % (MAX_PRICE + 1 - MIN_PRICE) + MIN_PRICE;
    }
    printf("The houses worth buying in the neighborhood: %d", houses_worth_tobuy(castles, 3));

    return 0;
}
