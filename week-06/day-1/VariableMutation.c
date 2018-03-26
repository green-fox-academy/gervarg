#include <stdio.h>
#include <stdlib.h>

int main()
{

    int a = 3;
    // make it bigger by 10
    printf("%d\n", a + 10);


    int b = 100;
    // make it smaller by 7
    printf("%d\n", b - 7);


    int c = 44;
    // please double c's value
    printf("%d\n", c * 2);


    int d = 125;
    // please divide by 5 d's value
    printf("%d\n", d / 5);


    int e = 8;
    // please cube of e's value
    printf("%d\n", e * e * e);


    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    if(f1 > f2) {
        printf("true\n");
    } else {
        printf("false\n");
    }

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    if(g1 < g2 * 2) {
        printf("true\n");
    } else {
        printf("false\n");
    }

    int h = 1357988018575474;
    // tell if it has 11 as a divisor (print as a boolean)
    if(h % 11 == 0){
        printf("true\n");
    } else {
        printf("false\n");
    }


    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    if((i1 > i2 * i2) && (i1 < i2 * i2 * i2)){
       printf("true\n");
       } else {
           printf("false\n");
       }

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    if (j % 3 == 0 || j % 5 == 0){
        printf("true\n");
    } else {
        printf("false\n");
    }

    char k[] = "Apple";
    //fill the k variable with its cotnent 4 times
    printf("%s\n", k);
    return 0;
}
