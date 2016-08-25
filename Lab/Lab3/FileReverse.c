
//-----------------------------------------------------------------------------
// FileReverse.c
// Reads input file and prints each word on a separate line of
// the output file.
//-----------------------------------------------------------------------------

#include<stdio.h>
#include<stdlib.h>
#include<string.h>


void stringReverse (char* s){
    int i, j;
    char tempChar;

    j = (strlen(s) - 1);

    for(i = 0; i<j; i++){
        tempChar = s[i];
        s[i] = s[j];
        s[j] = tempChar;
        j--;
    }
}

int main(int argc, char * argv[]){

   FILE *in, *out;   // handles for input and output files
   char word[256];   // char array to store words from input file

   // check command line for correct number of arguments
   if( argc != 3 ){
      printf("Usage: %s <input file> <output file>\n", argv[0]);
      exit(EXIT_FAILURE);
   }

   // open input file for reading
   in = fopen(argv[1], "r");
   // check if input file exists
   if( in==NULL ){
      printf("Unable to read from file %s\n", argv[1]);
      exit(EXIT_FAILURE);
   }

   // open output file for writing
   out = fopen(argv[2], "w");
   // check if output file exists
   if( out==NULL ){
      printf("Unable to write to file %s\n", argv[2]);
      exit(EXIT_FAILURE);
   }

   // read words from input file, print on separate lines in reverse to output file
   while(fscanf(in, " %s", word)!=EOF){
        stringReverse(word);
        fprintf(out, "%s\n", word);
   }

   // close input and output files
   fclose(in);
   fclose(out);

   return(EXIT_SUCCESS);
}
