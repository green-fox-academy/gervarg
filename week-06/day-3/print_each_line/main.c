int main ()
{
    FILE *fileptr;
    fileptr = fopen("my-file.txt", "r");
    char lines[150];
    while (!feof(fileptr)) {
        fgets(lines, 150, fileptr);
        printf("%s", lines);
    }
    fclose(fileptr);
    return 0;
}
