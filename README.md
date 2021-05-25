Compiler for simple programming language that supports ints. Lines prepended with // are comments and are ignored by compiler.

For examples of code and for testing, see ./Input\ texts

To build: javac *.java
To run: java Main <input text file>

This will create a .smp file of the same name as the input file that contains the binary bytestream that can be used as input to the interpreter.
These .smp files should be the exact same as the given .bin files of the same name in the ./Compiler_Binary_Output directory and will yield the same result when run through the interpreter.

The expected interpreter output, as well as the interpreter binary can be found in ./Interpreter_Output.
To run: ./interpeter <.bin or .smp file>
