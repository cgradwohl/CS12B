//-----------------------------------------------------------------------------
// ThreeIntegers.c
//-----------------------------------------------------------------------------

#include<stdio.h>
#include<stdlib.h>

int main(void){
   int x, y, z;
   printf("Enter three integers separated by commas, then press return: ");
   scanf(" %d, %d, %d", &x, &y, &z);    /*address at x, adress at y, adress at z*/
   printf("The integers entered were %d, %d, %d\n", x, y, z);
   return EXIT_SUCCESS;
}
