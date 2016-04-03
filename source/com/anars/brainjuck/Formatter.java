/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Formatter - Brainfuck Code Formatter and Beautifier
 * 
 * Copyright (c) 2016 Anar Software LLC. < http://anars.com >
 * 
 * This program is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your option) any later 
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program.  If not, see < http://www.gnu.org/licenses/ >
 * 
 */
package com.anars.brainjuck;

import java.io.File;

public class Formatter
  extends AbstractClass
{
  public Formatter(File inputFile, File outputFile, int tabSize)
  {
    super();
    String sourceCode = stripEverything(readFile(inputFile));
    if(!checkForBrackets(sourceCode))
      errorExit("Mismatched command " + Instructions.LOOP_START.getCommand() + " " + Instructions.LOOP_END.getCommand());
    StringBuilder stringBuilder = new StringBuilder();
    int sourceLength = sourceCode.length();
    String indentChars = (tabSize == 0 ? "\t" : repeatChar(tabSize, " "));
    int index = 0;
    int indentation = 0;
    char lastCommand = 0;
    while(index < sourceLength)
    {
      char command = sourceCode.charAt(index);
      if(command == Instructions.LOOP_START.getCommand())
      {
        stringBuilder.append("\n");
        stringBuilder.append(repeatChar(indentation, indentChars));
        stringBuilder.append(command);
        indentation++;
      }
      else if(command == Instructions.LOOP_END.getCommand())
      {
        stringBuilder.append("\n");
        indentation--;
        stringBuilder.append(repeatChar(indentation, indentChars));
        stringBuilder.append(command);
      }
      else
      {
        if(lastCommand != 0 && command != lastCommand)
        {
          stringBuilder.append("\n");
          stringBuilder.append(repeatChar(indentation, indentChars));
        }
        stringBuilder.append(command);
      }
      lastCommand = command;
      index++;
    }
    writeFile(outputFile, stringBuilder.toString());
  }
}
