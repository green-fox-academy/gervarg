#ifndef PARSER_H_INCLUDED
#define PARSER_H_INCLUDED

#define PORT_NAME_MAX_LEN   32
#define PORT_BUFFER_LEN     512
#define BAUD_RATE 115200

int get_port_name();
int open_port();
int close_port();
int log_data();
int list_data(char**, int);
void all_data(char*,char**);
void write_logs(char**);
void read_logs();


/*char *temp_lines;
typedef struct {
  char *dataptr;
  unsigned int length;
} Temp_data;

Temp_data *data;
data->length = 0;
data->dataptr = NULL;*/


#endif // PARSER_H_INCLUDED
