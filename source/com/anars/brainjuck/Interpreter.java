/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Interpreter - Brainfuck Interpreter Version 1.0
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

public class Interpreter
  extends AbstractClass
{
  private byte[] _array = new byte[0];
  private String sourceCode = null;
  private int _pointer = 0;
  private int _executingPoint = 0;
  //
  private long _debugProgramStartedAt = 0;
  private long _debugLoadendedAt = 0;
  private long _debugNumberOfInstructions = 0;

  public Interpreter(File sourceFile, boolean debug)
  {
    super();
    _debugProgramStartedAt = System.currentTimeMillis();
    sourceCode = stripEverything(readFile(sourceFile), debug);
    _debugLoadendedAt = System.currentTimeMillis();
    if(!checkForBrackets(sourceCode))
      errorExit("Mismatched command " + COMMAND_LOOP_START + " " + COMMAND_LOOP_END);
    int sourceLength = sourceCode.length();
    while(_executingPoint < sourceLength)
    {
      char command = sourceCode.charAt(_executingPoint);
      _debugNumberOfInstructions++;
      switch(command)
      {
        case COMMAND_INCREASE_VALUE:
          expandArray();
          _array[_pointer]++;
          break;
        case COMMAND_DECREASE_VALUE:
          expandArray();
          _array[_pointer]--;
          break;
        case COMMAND_MOVE_POINTER_RIGHT:
          _pointer++;
          break;
        case COMMAND_MOVE_POINTER_LEFT:
          _pointer--;
          if(_pointer < 0)
            _pointer = 0;
          break;
        case COMMAND_INPUT_VALUE:
          expandArray();
          try
          {
            _array[_pointer] = (byte)System.in.read();
          }
          catch(Exception exception)
          {
            exception.printStackTrace();
          }
          break;
        case COMMAND_OUTPUT_VALUE:
          System.out.print((char)(getCellValue() & 0xFF));
          break;
        case COMMAND_DUMP_MEMORY:
          dumpMemory();
          break;
        case COMMAND_LOOP_START:
          if(getCellValue() == 0)
          {
            int count = 1;
            while(count > 0)
            {
              char nextChar = sourceCode.charAt(++_executingPoint);
              if(nextChar == COMMAND_LOOP_START)
                count++;
              else if(nextChar == COMMAND_LOOP_END)
                count--;
            }
          }
          break;
        case COMMAND_LOOP_END:
          int count = 1;
          while(count > 0)
          {
            char nextChar = sourceCode.charAt(--_executingPoint);
            if(nextChar == COMMAND_LOOP_START)
              count--;
            else if(nextChar == COMMAND_LOOP_END)
              count++;
          }
          _executingPoint--;
          break;
      }
      _executingPoint++;
    }
    if(debug)
    {
      long currentTime = System.currentTimeMillis();
      System.out.println("\nBrainfuck Interpreter Statistics");
      System.out.println("=================================");
      System.out.println("Source Code File             : " + sourceFile);
      System.out.println("Source Code File Size        : " + sourceFile.length() + " bytes.");
      System.out.println("Number of Brainfuck Commands : " + sourceLength);
      System.out.println("Number of Commands Executed  : " + _debugNumberOfInstructions);
      System.out.println("Total Executing Time         : " + (currentTime - _debugProgramStartedAt) + " milliseconds.");
      System.out.println("Source Code Load Time        : " + (_debugLoadendedAt - _debugProgramStartedAt) + " milliseconds.");
      System.out.println("Command Execution Time       : " + (currentTime - _debugLoadendedAt) + " milliseconds.");
      System.out.println("Number of Memory Cells Used  : " + _array.length);
      System.out.print  ("Memory Dump                  :");
      dumpMemory();
    }
  }

  private void expandArray()
  {
    if(_pointer >= _array.length)
    {
      byte[] newArray = new byte[_pointer + 1];
      System.arraycopy(_array, 0, newArray, 0, _array.length);
      _array = newArray;
    }
  }

  private byte getCellValue()
  {
    if(_pointer >= _array.length)
      return (0);
    return (_array[_pointer]);
  }

  private void dumpMemory()
  {
    System.out.println();
    for(int index = 0; index < (_array.length / 8) + 1; index++)
    {
      for(int offset = 0; offset < 8; offset++)
        if(index * 8 + offset < _array.length)
          System.out.print((index * 8 + offset == _pointer ? "{" : " ") + Integer.toString(1000 + (0xff & _array[index * 8 + offset])).substring(1) + (index * 8 + offset == _pointer ? "}" : " "));
        else
          System.out.print((index * 8 + offset == _pointer ? "{" : " ") + "000" + (index * 8 + offset == _pointer ? "}" : " "));
      System.out.print("\t");
      for(int offset = 0; offset < 8; offset++)
        if(index * 8 + offset < _array.length)
          if((char)(_array[index * 8 + offset] & 0xFF) > 31)
            System.out.print((index * 8 + offset == _pointer ? "{" : " ") + (char)(_array[index * 8 + offset] & 0xFF) + (index * 8 + offset == _pointer ? "}" : " "));
          else
            System.out.print((index * 8 + offset == _pointer ? "{" : " ") + "." + (index * 8 + offset == _pointer ? "}" : " "));
        else
          System.out.print((index * 8 + offset == _pointer ? "{" : " ") + "." + (index * 8 + offset == _pointer ? "}" : " "));
      System.out.println();
    }
  }
}
