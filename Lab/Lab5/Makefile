#------------------------------------------------------------------------------
# Christopher S. Gradwohl
# cgradwoh
# Makefile
# makefile for IntegerStackClient.c with macros
#------------------------------------------------------------------------------

FLAGS   = -std=c99 -Wall
SOURCES = Dictionary.c DictionaryClient.c
OBJECTS = Dictionary.o DictionaryClient.o
HEADERS = Dictionary.h
EXEBIN  = DictionaryClient

all: $(EXEBIN)

$(EXEBIN) : $(OBJECTS) $(HEADERS)
	gcc -o $(EXEBIN) $(OBJECTS)

$(OBJECTS) : $(SOURCES) $(HEADERS)
	gcc -c $(FLAGS) $(SOURCES)

clean :
	rm -f $(EXEBIN) $(OBJECTS)

submit :
	submit cmps012b-pt.s16 lab5 Makefile README Dictionary.c DictionaryTest.c Dictionary.h DictionaryClient.c

check:
	valgrind --leak-check=full $(EXEBIN)
