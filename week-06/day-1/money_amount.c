#include <stdio.h>
#include <stdlib.h>

int main()
{

/*
Create a program which can tell how to pay an exact amount of money
for example 45670 Ft, is the amount (store this as an integer)
and the output should be:
2-20000Ft
1-5000Ft
1-500Ft
1-100Ft
1-50Ft
1-20Ft
*/

/*
Take care of the rounding (when giving back 5 coins):
1, 2 - 0 down
3, 4 - 5 up
6, 7 - 5 down
8, 9 - 0 up
*/
    int money_amount;
    printf("How much money I have: ");
    scanf("%d", &money_amount);
    int twenty_thousand;
    int ten_thousand;
    int five_thousand;
    int thousand;
    int five_hundred;
    int two_hundred;
    int one_hundred;
    int fifty;
    int twenty;
    int ten;
    int five;
//later to do this

    return 0;
}
