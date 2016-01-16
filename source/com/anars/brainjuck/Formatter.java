/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Formatter - Brainfuck Code Formatter and Beautifier Version 1.0
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
    String sourceCode = stripEverything(readSourceFile(inputFile));
    if(!checkForBrackets(sourceCode))
      errorExit("brackets", -1);
    StringBuilder stringBuilder = new StringBuilder();
    int sourceLength = sourceCode.length();
    String indentChars = (tabSize == 0 ? "\t" : repeatChar(tabSize, " "));
    int index = 0;
    int indentation = 0;
    char lastCommand = 0;
    while(index < sourceLength)
    {
      char command = sourceCode.charAt(index);
      if(command == COMMAND_LOOP_START)
      {
        stringBuilder.append("\n");
        stringBuilder.append(repeatChar(indentation, indentChars));
        stringBuilder.append(command);
        indentation++;
      }
      else if(command == COMMAND_LOOP_END)
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
    writeSourceFile(outputFile, stringBuilder.toString());
  }

  private String repeatChar(int times, String characters)
  {
    StringBuilder stringBuilder = new StringBuilder();
    for(int index = 0; index < times; index++)
      stringBuilder.append(characters);
    return (stringBuilder.toString());
  }
}
