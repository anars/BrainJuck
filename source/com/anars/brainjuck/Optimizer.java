/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Optimizer - Brainfuck Optimizer Version 1.0
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

public class Optimizer
  extends AbstractClass
{
  public Optimizer(File inputFile, File outputFile)
  {
    super();
    String sourceCode = stripEverything(readSourceFile(inputFile));
    int lastIndexOfBracket = sourceCode.lastIndexOf(COMMAND_LOOP_END);
    int lastIndexOfDot = sourceCode.lastIndexOf(COMMAND_OUTPUT_VALUE);
    sourceCode = sourceCode.substring(0, Math.max(lastIndexOfBracket, lastIndexOfDot) + 1).replaceAll("[\\" + COMMAND_LOOP_START + "][\\" + COMMAND_LOOP_END + "]", "" + COMMAND_LOOP_START + "~" + COMMAND_LOOP_END);
    System.out.println(sourceCode);
    StringBuilder stringBuilder = null;
    int sourceLength = 0;
    do
    {
      if(stringBuilder != null)
        sourceCode = stringBuilder.toString().replaceAll("[\\" + COMMAND_LOOP_START + "][\\" + COMMAND_LOOP_END + "]", "");
      stringBuilder = new StringBuilder();
      sourceLength = sourceCode.length();
      int index = 0;
      int count = 0;
      int repateType = 0;
      while(index < sourceLength)
      {
        char command = sourceCode.charAt(index);
        if((repateType == 0 || repateType == 1) && (command == COMMAND_INCREASE_VALUE || command == COMMAND_DECREASE_VALUE))
        {
          repateType = 1;
          count += (command == COMMAND_INCREASE_VALUE ? 1 : -1);
        }
        else if(repateType == 1)
        {
          char newCommand = count > 0 ? COMMAND_INCREASE_VALUE : COMMAND_DECREASE_VALUE;
          for(int quantity = 0; quantity < Math.abs(count); quantity++)
            stringBuilder.append(newCommand);
          count = 0;
          repateType = 0;
          index--;
        }
        else if((repateType == 0 || repateType == 2) && (command == COMMAND_MOVE_POINTER_RIGHT || command == COMMAND_MOVE_POINTER_LEFT))
        {
          repateType = 2;
          count += (command == COMMAND_MOVE_POINTER_RIGHT ? 1 : -1);
        }
        else if(repateType == 2)
        {
          char newCommand = count > 0 ? COMMAND_MOVE_POINTER_RIGHT : COMMAND_MOVE_POINTER_LEFT;
          for(int quantity = 0; quantity < Math.abs(count); quantity++)
            stringBuilder.append(newCommand);
          count = 0;
          repateType = 0;
          index--;
        }
        else
        {
          stringBuilder.append(command);
        }
        index++;
      }
      //System.out.println(stringBuilder.toString());
    }
    while(stringBuilder.length() != sourceLength);
    System.out.println(stringBuilder.toString().replaceAll("[\\" + COMMAND_LOOP_START + "][\\" + COMMAND_LOOP_END + "]", "").replaceAll("[\\" + COMMAND_LOOP_START + "]~[\\" + COMMAND_LOOP_END + "]", "" + COMMAND_LOOP_START + COMMAND_LOOP_END));
  }
}
