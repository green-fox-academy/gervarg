#include <stdio.h>
#include <stdint.h>

// Use the Computer struct, give values to the fields and print them out in the main!
// Use the Notebook struct, give values to the fields and print them out in the main!

struct Computer {
    float cpu_speed_GHz;
    int ram_size_GB;
    int bits;
};

typedef struct {
    float cpu_speed_GHz;
    int ram_size_GB;
    int bits;
} Notebook;

int main()
{
    struct Computer my_comp;
    Notebook my_note;
    my_comp.cpu_speed_GHz = 3.8;
    my_comp.ram_size_GB = 16;
    my_comp.bits = 64;
    printf("My computers cpu speed is %.2f GHz, RAM size is %d GB, and OS is %d bits\n", my_comp.cpu_speed_GHz, my_comp.ram_size_GB, my_comp.bits);
    printf("My notebooks cpu speed is %f GHz, RAM size is %d GB, and OS is %d bits\n", my_note.cpu_speed_GHz = 2.4, my_note.ram_size_GB = 12, my_note.bits = 64);
    return 0;
}
