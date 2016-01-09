# BrainJuck
Brainfuck Java Tools

##What is Brainfuck?
Brainfuck is an [esoteric programming language](https://en.wikipedia.org/wiki/Esoteric_programming_language) created in 1993 by Urban Müller, and notable for its extreme minimalism.

The language's name is a reference to the slang term "brain fuck", which refers to things so complicated or unusual that they exceed the limits of one's understanding. Due to the fact that the last half of its name is often considered one of the most offensive words in the English language, it is sometimes referred to as brainf\*\*\*, brainf\*ck, brainfsck, b\*\*\*\*fuck, brainf\*\*k or BF.

The language consists of only eight simple commands, operates on an array of memory cells, also referred to as the tape, each initially set to zero. There is a pointer, initially pointing to the first memory cell. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.

##Brainfuck Commands
Command | Description
:------:|:-----------
   >    | Move the pointer to the right
   <    | Move the pointer to the left
   +    | Increment (increase by one) the byte at the data pointer
   -    | Decrement (decrease by one) the byte at the data pointer
   .    | Output the byte at the data pointer
   ,    | Input a character, storing its value in the byte at the data pointer
   [    | Jump past the matching ] if the cell under the pointer is 0
   ]    | Jump back to the matching [ if the cell under the pointer is nonzero
