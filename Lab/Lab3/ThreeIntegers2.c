//-----------------------------------------------------------------------------
// ThreeIntegers2.c
//-----------------------------------------------------------------------------

#include<stdio.h>
#include<stdlib.h>

int main(void){
   int n, i; int x[3];
   printf("Enter three integers separated by spaces, then press return: ");
   n = scanf(" %d %d %d", &x[0], &x[1], &x[2]);
   printf("%d numbers were successfully read: ", n); /*NOTE: that %d is were n = scanf() is printed which comes after the comma!!!!!*/
   for(i=0; i<n; i++) printf("%d ", x[i]);
   printf("\n");
   return EXIT_SUCCESS;
}
