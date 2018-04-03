#include <stdio.h>

// Write a function that takes a car as an argument and prints all it's stats
// If the car is a Tesla it should not print it's gas level

enum car_type {VOLVO, TOYOTA, LAND_ROVER, TESLA};

struct car {
	enum car_type type;
	double km;
	double gas;
};

void car_stats(struct car my_car)
{
    if(my_car.type == TESLA)
        printf("The Tesla has no gas amount, and traveled: %.2f km\n", my_car.km);
    else
        printf("The cars gas amount is: %.2f liter, the distance it traveled so far is: %.2f km\n", my_car.gas, my_car.km);
}

int main()
{
	struct car volvo_car;
    volvo_car.gas = 20.53;
    volvo_car.km = 3456.67;
    volvo_car.type = VOLVO;
    struct car tesla_car;
    tesla_car.km = 2560.89;
    tesla_car.type = TESLA;
	car_stats(volvo_car);
	car_stats(tesla_car);
	return 0;
}
