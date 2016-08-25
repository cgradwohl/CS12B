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
    char X[256] = {'a', 'b', 'c', 'd', 'e', 'f'};
    stringReverse(X);
    printf("char []X =  %s\n", X);
    return 0;
}

SUBMIT          = submit cmps012b-pt.s16 pa2
