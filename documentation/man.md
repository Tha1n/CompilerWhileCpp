# NAME
  whpp - pretty print while programs

# SYNOPSIS
  java -jar __whpp__ `[OPTION]`...

# DESCRIPTION
  Transform a ugly indented while program into a beautiful indented while program.

## Options
  `-all`,  
    give the default indentation length for __all__ structures

  `-if`,  
    give the default indentation length for the __if__ structure

  `-foreach`,  
    give the default indentation length for the __foreach__ structure

  `-while`,  
    give the default indentation length for the __while__ structure

  `-i`,  
    the input file which contains a while program to indent

  `-o`,  
    the output file which will contains the indented while program

  `-page`,  
    the maximum width of a program

## Exit status
  If the `-o` option is not used, whpp print the pretty indented program.   If the `-o` option is used, whpp create a file defined by the option and print the indented program into this file.  
  If the `-i` option is not used, whpp doesn't print anything.

## Known bugs
  None

# Authors
  Written by Sébastien Blin, Pierre-Henri Collin, Kevin Ledy, Alexandre Quettier, Benjamin Vion

# Reporting Bugs
  You can open an issue at : [https://github.com/Tha1n/ProjetCompilation](https://github.com/Tha1n/ProjetCompilation)
