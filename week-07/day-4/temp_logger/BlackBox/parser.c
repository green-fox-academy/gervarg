#include <stdio.h>
#include <time.h>
#include "rs232/rs232.h"
#include "parser.h"
#include "printer.h"
#include "string.h"
#include <Windows.h>


int parser_port = -1;
char **data = NULL;

int get_port_name()
{
	clear_screen();
	printf("Please enter the name of the serial port you want to use!\n");
	char port_name[PORT_NAME_MAX_LEN];
	fgets(port_name, PORT_NAME_MAX_LEN - 1, stdin);

	// Remove \r and \n characters
	for (int i = 0; i < PORT_NAME_MAX_LEN; i++) {
		if (port_name[i] == '\r' || port_name[i] == '\n')
			port_name[i] = '\0';
	}

	// Find the index of that port
	parser_port = comFindPort(port_name);

	if (parser_port < 0) {
		printf("%s not exists!\n", port_name);
		return -1;
	} else {
		printf("%s port exists, saved.\n", port_name);
	}

	return 0;
}

int open_port()
{
	clear_screen();
	if (parser_port < 0) {
		printf("Port not set!\n");
		return -1;
	}

	comClose(parser_port);
	if(!comOpen(parser_port, BAUD_RATE)) {
		printf("Port can not be opened. Try to set the port again!\n");
		return -1;
	} else {
		printf("Port opened successfully!\n");
		return 0;
	}
}

int close_port()
{
	clear_screen();
	if (parser_port < 0) {
		printf("Port not set!\n");
		return -1;
	}

	comClose(parser_port);
	printf("Port closed.\n");
	return 0;
}


int get_line_from_port(char *buff, int buff_len)
{
	if (parser_port < 0) {
		printf("Port not set!\n");
		return -1;
	}

	// Put data into the
	char ch;
	int i = 0;
	int bytes = comRead(parser_port, &ch, 1);
	// If there is no data on the port, exit
	if (bytes <= 0) {
		return 0;
	}
	// This loop will read until a \n character. If the buffer is too small, then
	// the characters will be discarded after the size limit is reached.
	while (ch != '\n') {
		// Check if there is enough space in the buffer
		if (i < (buff_len - 1)) {
			// Check if we are not near the end of the line (cr character)
			if (ch != '\r') {
				buff[i] = ch;
				i++;
			}
		}
		while (comRead(parser_port, &ch, 1) == 0);
	}
	// Put terminating zero at the end
	buff[i] = '\0';

	return i;
}

int log_data()
{
	// Check if port set up properly
	if (parser_port < 0) {
		printf("Port not set!\n");
		return -1;
	}

	// Get a line of data from the port
	// If there is no data on the port, then do nothing
	char buff[PORT_BUFFER_LEN];
	if (get_line_from_port(buff, PORT_BUFFER_LEN) > 0) {

        static int counter = 0;

        char *temp = (char*) malloc(sizeof(buff));
        strcpy(temp, buff);
        char *ptr_filter = strtok(buff, ".: ");

        int month;
        int day;
        int hour;
        int minute;
        int second;
        int temperature_length;
        for (int i = 0; i < 6; i++){
            ptr_filter = strtok(NULL, ".: ");
            if (i == 0) {
                char *month_ptr = (char*)malloc(sizeof(10));
                month_ptr = ptr_filter;
                month = atoi(month_ptr);
                free(month_ptr);
            }
            else if (i == 1){
                char *day_ptr = (char*)malloc(sizeof(10));
                day_ptr = ptr_filter;
                day = atoi(day_ptr);
                free(day_ptr);
            }
            else if (i == 2){
                char *hour_ptr = (char*)malloc(sizeof(10));
                hour_ptr = ptr_filter;
                hour = atoi(hour_ptr);
                free(hour_ptr);
            }
            else if (i == 3){
                char *minute_ptr = (char*)malloc(sizeof(10));
                minute_ptr = ptr_filter;
                minute = atoi(minute_ptr);
                free(minute_ptr);
            }
            else if (i == 4) {
                char *second_ptr = (char*)malloc(sizeof(10));
                second_ptr = ptr_filter;
                second = atoi(second_ptr);
                free(second_ptr);
            }
            else {
                char *temp_ptr = (char*)malloc(sizeof(20));
                temp_ptr = ptr_filter;
                temperature_length = strlen(temp_ptr);
                free(temp_ptr);
            }
        }
        if (month > 0 && month < 13 && day > 0 && day < 32 &&
            hour >= 0 && hour < 25 && minute >= 0 && minute < 60
            && second >= 0 && second < 60 && temperature_length < 4){

            printf("%s\n",temp);
            data = (char**)realloc(data, (counter+1)*sizeof(*data));
            data[counter] = (char*)malloc(sizeof(temp));
            strcpy(data[counter], temp);
            counter++;
        }

        free(temp);

        // Put the data into the logfile
        //Printing the buffer



	}

	return 0;
}

void all_data(char *unfiltered_data, char **data)
{
    static int counter = 0;
    data = (char**)realloc(data, (counter+1)*sizeof(*data));
    data[counter] = (char*)malloc(sizeof(unfiltered_data));

    strcpy(data[counter], unfiltered_data);
    printf("%s\n", data[counter]);
    counter++;
}

void write_logs(char **data)
{
    FILE *fileptr;
    int i;
    fileptr = fopen("temp_log.txt", "w");
    while(!feof(fileptr)) {
        fprintf(fileptr,"%s\n", data[i]);
        i++;
    }
    fclose(fileptr);
}

int list_data(char **sorted_data, int size)
{
    for (int i = 0; i < size; i++) {
        printf("%s\n", sorted_data[i]);
    }
    return 0;
}

void read_logs()
{
    clear_screen();
    FILE *fileptr;
    char lines[150];
    fileptr = fopen("temp_log.txt", "r");
    if (fileptr == NULL)
        printf("Something went wrong! Could not open file!");
    while(!feof(fileptr)) {
        fgets(lines, 150, fileptr);
        printf("%s\n", lines);
    }
    fclose(fileptr);
}
