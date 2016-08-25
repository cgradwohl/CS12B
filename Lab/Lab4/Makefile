#------------------------------------------------------------------------------
# Makefile
# Christopher S. Gradwohl
# cgradwoh
# lab4
# Mkaefile for lab4
#------------------------------------------------------------------------------

FLAGS 	= -std=c99 -Wall
SOURCES = charType.c
OBJECTS = charType.o
EXEBIN 	= chartype

all: $(EXEBIN)

$(EXEBIN) : $(OBJECTS)
	gcc -o $(EXEBIN) $(OBJECTS)

$(OBJECTS) : $(SOURCES)
	gcc -c $(FLAGS) $(SOURCES)

clean :
	rm $(EXEBIN) $(OBJECTS)

submit :
	submit cmps012a-pt.s16 lab4 Makefile README charType.c

check :
	valgrind --leak-check=full charType $(SOURCES) outfile
