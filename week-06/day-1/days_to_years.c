#include <stdio.h>
#include <stdlib.h>

int main()
{

    /*
    Create a program which converts days to years, months, weeks and days
    to keep it simple we say every year is 365 days long, every month is 30 days
    */
    int day_in_month = 30;
    int day_in_year = 365;
    int input_day;
    printf("Give me the days you want to convert: ");
    scanf("%d", &input_day);
    int year = input_day / day_in_year;
    int month = (input_day / day_in_month) - (year * 12);
    int week = (input_day / 7) - (year * 52) - (month * 4);
    int day = input_day - (year * 365) - (month * day_in_month) - (week * 7);
    printf("%d years, %d months, %d weeks, %d days", year, month, week, day);



    return 0;
}
