#include <stdio.h>

/* Pokemon database!
 * You should store the following data in a structure
 *  - the name of the pokemon (which is shorter than 256 characters)
 *  - the age of the pokemon (in years)
 *  - the strength of the pokemon (between 0.0-10.0)
 *  - the speed of the pokemon (between 0.0-10.0)
 *  - the type of the pokemon (as a custom type, see below)
 *
 * You should store the pokemon type in an enumeration
 * the valid types are:
 *  - normal
 *  - fire
 *  - water
 *  - electric
 *  - grass
 *  - ice
 *  - fighting
 *  - poision
 *  - ground
 *  - flying
 *  - psychic
 *  - bug
 *  - rock
 *  - ghost
 *  - dragon
 *  - dark
 *  - steel
 *  - fairy
 *
 * The "pokemon"-s are stored in an array.
 *
 * Write the following functions:
 * 1) Get faster pokemons than
 *      - parameters:
 *          - array
 *          - array length
 *          - speed
 *      - it returns the count of the faster pokemons than the parameter "speed"
 * 2) Get type count
 *      - parameters:
 *          - array
 *          - array length
 *          - type
 *      - it returns the count of pokemons which are "type"
 * 3) Get strongest type
 *      - parameters:
 *          - array
 *          - array length
 *          - strength
 *      - it returns the type of the strongest pokemon
 * 4) Get maximal strength of a type
 *      - parameters:
 *          - array
 *          - array length
 *          - type
 *      - it returns the highest strength among the "type" type pokemons
 *
 * Don't forget to handle invalid inputs (NULL pointers, invalid values etc.)
 */

 enum poke_type{normal, fire, water, electric, grass, ice, fighting, poison, ground, flying, psychic, bug, rock, ghost, dragon, dark, steel, fairy};

 typedef struct {
    char name[256];
    int age;
    float strenght;
    float speed;
    enum poke_type type;
 } pokemon;

 int get_faster(pokemon *poke_bag, int array_length, float speed)
 {
     int i, counter = 0;
     for (i = 0; i < array_length; i++)
            if (poke_bag[i].speed > speed)
                counter++;
     return counter;
 }

 int get_type_count(pokemon *poke_bag, int array_length, enum poke_type type)
 {
     int i, counter = 0;
     for (i = 0; i < array_length; i++)
        if (poke_bag[i].type == type)
            counter++;
     return counter;
 }

 int get_strongest_type(pokemon *poke_bag, int array_length, )

int main()
{

    return 0;
}
