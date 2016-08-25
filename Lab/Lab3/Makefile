#	Makefile for .c file with macors
FLAGS	=	-std=c99 -Wall
SOURCES	=       FileReverse.c
OBJECTS =	FileReverse.o
EXEBIN	=	go

all: $(EXEBIN)

$(EXEBIN)	:	$(OBJECTS)
	gcc -o $(EXEBIN) $(OBJECTS)

$(OBJECTS)	:	$(SOURCES)
	gcc -c	$(FLAGS) $(SOURCES)

clean	:
	rm -f $(EXEBIN) $(OBJECTS)
