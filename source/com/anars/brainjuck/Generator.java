/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Generator - Brainfuck Code Generator
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

public class Generator
  extends Submodule
{
  public Generator(File inputFile, File outputFile)
  {
    super();
    String text = readFile(inputFile);
    StringBuilder stringBuilder = new StringBuilder();
    int previousChar = 0;
    for(int index = 0; index < text.length(); index++)
    {
      int character = 0xFF & text.charAt(index);
      int difference = previousChar - character;
      char command = (difference < 0 ? Instructions.INCREASE_VALUE.getCommand() : Instructions.DECREASE_VALUE.getCommand());
      difference = Math.abs(difference);
      if(difference > 0 && difference < 8)
      {
        stringBuilder.append(repeatChar(difference, "" + command));
      }
      else if(difference >= 8)
      {
        int loopCount = (int)Math.sqrt(difference);
        int multiplier = loopCount;
        while(loopCount * (multiplier + 1) <= difference)
          multiplier++;
        int remainder = difference - (loopCount * multiplier);
        stringBuilder.append(Instructions.MOVE_POINTER_RIGHT.getCommand());
        stringBuilder.append(repeatChar(loopCount, "" + Instructions.INCREASE_VALUE.getCommand()));
        stringBuilder.append(Instructions.LOOP_START.getCommand());
        stringBuilder.append(Instructions.MOVE_POINTER_LEFT.getCommand());
        stringBuilder.append(repeatChar(multiplier, "" + command));
        stringBuilder.append(Instructions.MOVE_POINTER_RIGHT.getCommand());
        stringBuilder.append(Instructions.DECREASE_VALUE.getCommand());
        stringBuilder.append(Instructions.LOOP_END.getCommand());
        stringBuilder.append(Instructions.MOVE_POINTER_LEFT.getCommand());
        if(remainder > 0)
          stringBuilder.append(repeatChar(remainder, "" + command));
      }
      stringBuilder.append(Instructions.OUTPUT_VALUE.getCommand());
      previousChar = character;
    }
    writeFile(outputFile, stringBuilder.toString());
  }
}
