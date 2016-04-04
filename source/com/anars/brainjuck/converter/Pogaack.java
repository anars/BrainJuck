/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Pogaack Converter - Brainfuck Code Generator
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

public class Pogaack
  implements Language
{
  private int _instruction = 0;
  private int _wrapAfter = 8;

  @Override public String concert(char command)
  {
    String output = "";
    _instruction++;
    if(_instruction > _wrapAfter)
    {
      output += "\n";
      _instruction = 0;
    }
    output += " ";
    if(command == Instructions.MOVE_POINTER_RIGHT.getCommand())
    {
      output += "pogack!";
    }
    else if(command == Instructions.MOVE_POINTER_LEFT.getCommand())
    {
      output += "pogaack!";
    }
    else if(command == Instructions.INCREASE_VALUE.getCommand())
    {
      output += "pogaaack!";
    }
    else if(command == Instructions.DECREASE_VALUE.getCommand())
    {
      output += "poock!";
    }
    else if(command == Instructions.OUTPUT_VALUE.getCommand())
    {
      output += "pogaaack?";
    }
    else if(command == Instructions.INPUT_VALUE.getCommand())
    {
      output += "poock?";
    }
    else if(command == Instructions.LOOP_START.getCommand())
    {
      output += "pogack?";
    }
    else if(command == Instructions.LOOP_END.getCommand())
    {
      output += "pogaack?";
    }
    return (output);
  }

  @Override public String getFooter()
  {
    return ("");
  }

  @Override public String getHeader()
  {
    return ("");
  }

  public void setWrapAfter(int wrapAfter)
  {
    _wrapAfter = wrapAfter;
  }

  public int getWrapAfter()
  {
    return (_wrapAfter);
  }
}
