
CC=scalac
FILES=summer-app.scala ChecksumAccumulator.scala FallWinterSpringSummer.scala

all: Summer.class FallWinterSpringSummer.class

Summer.class FallWinterSpringSummer.class:
	$(CC) $(FILES)
	
clean:
	rm -rf *.class

run: Summer.class
	scala Summer $(INPUT)

help:
	@echo "make help 				Show this message."
	@echo "make  		 			Compile the Scala Summer app"	
	@echo "make run INPUT=''			Run the Scala Summer app"
	@echo "make clean 				Removes all compiled scala files"	
