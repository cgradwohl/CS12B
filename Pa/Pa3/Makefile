#-----------------------------------------------------------------------------
# Makefile
# Christopher S. Gradwohl
# cgradwoh
# pa3
# Makefile for CMPS 12B pa3
# this Makefile uses wildcards and pattern substitution
#-----------------------------------------------------------------------------

JAVAC      = javac
MAINCLASS  = DictionaryClient
JAVASRC    = $(wildcard *.java)
SOURCES    = $(JAVASRC) Makefile README
CLASSES    = $(patsubst %.java, %.class, $(JAVASRC))
JARCLASSES = $(patsubst %.class, %*.class, $(CLASSES))
JARFILE    = $(MAINCLASS)
SUBMIT     = submit cmps012b-pt.s16 pa3


all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(JARCLASSES)
	chmod +x $(JARFILE)
	rm Manifest

%.class: %.java
	$(JAVAC) $<

submit: $(SOURCES)
	$(SUBMIT) $(SOURCES)

clean:
	rm -f *.class $(JARFILE)

check: $(SUBMIT) $(SOURCES)
