#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char* argv[]){
    typedef struct student {
        int age;
        char major[50];
        char first[50];
        char last[50];
    }   student;

    // to declare a structure on heap memory
    // the pointer pChris points to a student structure on the heap
    student* pChris = malloc(sizeof(student));

    student Chris;
    //Chris.age = 27;
    strcpy(Chris.major, "Computer Science");
    strcpy(Chris.first, "Chris");
    strcpy(Chris.last, "Gradwohl");
    printf("Chris' Major is:%s\n", Chris.major );

    //typedef operator
    typedef struct guy{
        int age;
        int height;
    } guy;
    guy Mike;
    guy* pMike = malloc(sizeof(guy));

    pMike->age = 27;
    pMike->height = 78;//dont know how to print these out :(

    printf("Mikes' age is:%d\n", Mike );






    //defines a new data type called NodeObj
    typedef struct NodeObj{
        int item;
        struct NodeObj* next;
    } NodeObj;
    // pointer to a NodeObj called Node
    typedef NodeObj* Node;
    // decalre and initialize a pointer to a NodeObj
    Node N = malloc(sizeof(NodeObj));
    N->item = 5;
    N->next = NULL;












    return EXIT_SUCCESS;
}
