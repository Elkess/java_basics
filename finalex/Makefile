# Variables
JC = javac
JVM = java
MAIN = lib.app.Main

# Default target when you just type 'make'
all: compile

# Compiles all Java files
compile:
	$(JC) lib/model/*.java lib/app/Main.java

# Compiles (if needed) and runs the application
run: compile
	$(JVM) $(MAIN)

# Deletes all compiled .class files to keep the directory clean
clean:
	rm -f lib/model/*.class lib/app/*.class