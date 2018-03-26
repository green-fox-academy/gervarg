#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Write a program that asks for two numbers
    // Thw first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is exellent!
    // If the the number of girls and boys are equal and there are more people coming than 20
    //
    // It should print: Quite cool party!
    // It there are more than 20 people coming but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    int girls_number;
    int boys_number;
    printf("Enter the number of girls in the party: ");
    scanf("%d", &girls_number);
    printf("Enter the number of boys in the party: ");
    scanf("%d", &boys_number);
    int people = girls_number + boys_number;
    if(boys_number == girls_number && people > 20){
        printf("The party is excellent!");
    } else if (boys_number > girls_number && people > 20){
        printf("Quite cool party!");
    } else if (girls_number == 0){
        printf("Sausage party...");
    } else {
        printf("Avarage party.");
    }


    return 0;
}
