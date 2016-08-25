#------------------------------------------------------------------------------
# Another Makefile with macros
#------------------------------------------------------------------------------
JAVASRC 	= LC.java
SOURCES 	= README Makefile $(JAVASRC)
MAINCLASS 	= LC
CLASSES 	= LC.class
JARFILE 	= LC
SUBMIT 		= submit cmps012b-pt.s16 lab1

all: $(JARFILE)
	
$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean:
	rm $(CLASSES) $(JARFILE)

submit: $(SOURCES)
	$(SUBMIT) $(SOURCES)
