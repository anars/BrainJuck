package com.anars.brainjuck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Calendar;

public abstract class AbstractClass
{
  protected static final char COMMAND_LOOP_START = '[';
  protected static final char COMMAND_LOOP_END = ']';
  protected static final char COMMAND_INCREASE_VALUE = '+';
  protected static final char COMMAND_DECREASE_VALUE = '-';
  protected static final char COMMAND_MOVE_POINTER_RIGHT = '>';
  protected static final char COMMAND_MOVE_POINTER_LEFT = '<';
  protected static final char COMMAND_OUTPUT_VALUE = '.';
  protected static final char COMMAND_INPUT_VALUE = ',';
  protected static final char COMMAND_DUMP_MEMORY = '#';
  protected String loadSourceFile(File sourceFile)
  {
    String sourceCode = null;
    BufferedReader bufferedReader = null;
    try
    {
      bufferedReader = new BufferedReader(new FileReader(sourceFile));
      StringBuilder stringBuilder = new StringBuilder();
      String line = bufferedReader.readLine();
      while(line != null)
      {
        stringBuilder.append(line);
        stringBuilder.append("\n");
        line = bufferedReader.readLine();
      }
      sourceCode = stringBuilder.toString();
    }
    catch(Exception exception)
    {
      errorExit("haha", -1);
    }
    finally
    {
      try
      {
        bufferedReader.close();
      }
      catch(IOException ioException)
      {
        // Ignore
      }
    }
    return (sourceCode);
  }

  protected boolean checkForBrackets(String sourceCode)
  {
    String brackets = sourceCode.replaceAll("[^\\" + COMMAND_LOOP_START + "\\" + COMMAND_LOOP_END + "]", "");
    int count = 0;
    for(int index = 0; index < brackets.length(); index++)
      count += (brackets.charAt(index) == COMMAND_LOOP_START ? 1 : -1);
    return (count == 0);
  }

  protected String stripEverything(String sourceCode)
  {
    return (stripEverything(sourceCode, false));
  }

  protected String stripEverything(String sourceCode, boolean debug)
  {
    return (sourceCode.replaceAll("[^" + //
    "\\" + COMMAND_LOOP_START + //
    "\\" + COMMAND_LOOP_END + //
    "\\" + COMMAND_INCREASE_VALUE + //
    "\\" + COMMAND_DECREASE_VALUE + //
    "\\" + COMMAND_MOVE_POINTER_RIGHT + //
    "\\" + COMMAND_MOVE_POINTER_LEFT + //
    "\\" + COMMAND_OUTPUT_VALUE + //
    "\\" + COMMAND_INPUT_VALUE + //
    (debug ? "\\" + COMMAND_DUMP_MEMORY : "") + //
    "]", ""));
  }
  protected void errorExit(String message, int errorCode)
  {
    System.err.println(message + ". Please type -help for details.");
    System.exit(errorCode);
  }
  protected void helpExit()
  {
    System.out.println("\nBrainfuckJC - Brainfuck to Java Converter/Compiler - version 1.0\n" + //
      "Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Anar Software LLC. < http://anars.com >\n\n" + //
      "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n\n" + //
      "This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.\n" + //
      "See the GNU General Public License for more details at http://www.gnu.org/licenses\n\n" + //
      "USAGE:\n" + //
      "\tjava -jar BrainfuckJC.jar [OPTIONS]...\n\n" + //
      "DESCRIPTION:\n\n" + //
      "-brainfuck-file=[PATH]\n" + //
      "\tFull path to Brainfuck source file.\n" + //
      "\tE.g. -brainfuck-file=../test.bf\n\n" + //
      "-help\n" + //
      "\tDisplays this help\n");
    System.exit(0);
  }
}
