#include <stdio.h>
#include <string.h>

/*
Create a sandwich struct
It should store:
 - name
 - price (float)
 - weight (float)
Create a function which takes two parameters and returns the price of your order.
The parameters should be:
 - a sandwich struct
 - and an integer that represents how many sandwiches you want to order
*/
typedef struct {
    char name[50];
    float price;
    float weight;
}sandwich;

float order_price(sandwich my_sandwich, int number_of_sandwiches)
{
    my_sandwich.price = 3.84;
    strcpy(my_sandwich.name, "Phylly Cheese");
    my_sandwich.weight = 0.5;
    return my_sandwich.price * number_of_sandwiches;
}

int main()
{
    int number = 3;
    sandwich phylly_cheese;
    printf("The %d Phylly Cheeses price I ordered is: %.2f", number, order_price(phylly_cheese, number));
    return 0;
}
