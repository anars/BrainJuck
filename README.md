# BrainJuck
> Rapid Application Development with only 3 bits!

BrainJuck is a set of Brainfuck tools and Brainfuck to Java converter.

##What is Brainfuck?
Brainfuck is an [esoteric programming language](https://en.wikipedia.org/wiki/Esoteric_programming_language) created in 1993 by Urban Müller, and notable for its extreme minimalism. His original interpreter, compile code and samples are located in [/BrainJuck/original/](https://github.com/anars/BrainJuck/tree/master/original) folder of the repository.

The language's name is a reference to the slang term "brain fuck", which refers to things so complicated or unusual that they exceed the limits of one's understanding. Due to the fact that the last half of its name is often considered one of the most offensive words in the English language, it is sometimes referred to as brainf\*\*\*, brainf\*ck, brainfsck, b\*\*\*\*fuck, brainf\*\*k or BF.

The language consists of only eight simple commands, operates on an array of memory cells, also referred to as the tape, each initially set to zero. There is a pointer, initially pointing to the first memory cell. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.

##Brainfuck Commands
The eight language commands, each consisting of a single character:

Command | Description
:------:|:-----------
   >    | Move the pointer to the right
   <    | Move the pointer to the left
   +    | Increment the byte at the data pointer
   -    | Decrement the byte at the data pointer
   .    | Output the byte at the data pointer
   ,    | Input a byte into memory cell at the data pointer
   [    | Jump past the matching ] if the byte at the data pointer is 0
   ]    | Jump back to the matching [ if the byte at the data pointer is not 0
   
   All characters other than ><+-.,[] should be considered comments and ignored.
