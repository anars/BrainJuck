/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * ASCIIArt Converter - Brainfuck Code Generator
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
package com.anars.brainjuck.converter;

import com.anars.brainjuck.Instructions;

public class ASCIIArt
  implements Language
{
  @Override public String concert(char command)
  {
    String output = "";
    if(command == Instructions.MOVE_POINTER_RIGHT.getCommand())
    {
      output += "\\\n";
      output += " \\\n";
      output += " /\n";
      output += "/";
    }
    else if(command == Instructions.MOVE_POINTER_LEFT.getCommand())
    {
      output += " /\n";
      output += "/\n";
      output += "\\\n";
      output += " \\";
    }
    else if(command == Instructions.INCREASE_VALUE.getCommand())
    {
      output += "  |\n";
      output += "  |\n";
      output += "-----\n";
      output += "  |\n";
      output += "  |";
    }
    else if(command == Instructions.DECREASE_VALUE.getCommand())
    {
      output += "-----";
    }
    else if(command == Instructions.OUTPUT_VALUE.getCommand())
    {
      output += "##\n";
      output += "##";
    }
    else if(command == Instructions.INPUT_VALUE.getCommand())
    {
      output += "##\n";
      output += "##\n";
      output += "_|";
    }
    else if(command == Instructions.LOOP_START.getCommand())
    {
      output += " ___\n";
      output += "|\n";
      output += "|\n";
      output += "|\n";
      output += "|\n";
      output += "|___";
    }
    else if(command == Instructions.LOOP_END.getCommand())
    {
      output += "___\n";
      output += "   |\n";
      output += "   |\n";
      output += "   |\n";
      output += "   |\n";
      output += "___|";
    }
    return (output + "\n\n");
  }
  @Override public String getFooter()
  {
    return ("");
  }
  @Override public String getHeader()
  {
    return ("");
  }
}
