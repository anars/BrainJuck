/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * XMLfuck Converter - Brainfuck Code Generator
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

public class XMLfuck
  implements Language
{
  private int _indentation = 1;
  private String _tabChars = "\t";

  @Override public String concert(char command)
  {
    String output = (command == Instructions.LOOP_END.getCommand() ? "" : intend());
    if(command == Instructions.MOVE_POINTER_RIGHT.getCommand())
    {
      output += "<ptrinc />\n";
    }
    else if(command == Instructions.MOVE_POINTER_LEFT.getCommand())
    {
      output += "<ptrdec />\n";
    }
    else if(command == Instructions.INCREASE_VALUE.getCommand())
    {
      output += "<inc />\n";
    }
    else if(command == Instructions.DECREASE_VALUE.getCommand())
    {
      output += "<dec />\n";
    }
    else if(command == Instructions.OUTPUT_VALUE.getCommand())
    {
      output += "<print />\n";
    }
    else if(command == Instructions.INPUT_VALUE.getCommand())
    {
      output += "<read />\n";
    }
    else if(command == Instructions.LOOP_START.getCommand())
    {
      output += "<while>\n";
      _indentation++;
    }
    else if(command == Instructions.LOOP_END.getCommand())
    {
      _indentation--;
      output += intend();
      output += "</while>\n";
    }
    return (output);
  }

  @Override public String getFooter()
  {
    return ("</fuck>");
  }

  @Override public String getHeader()
  {
    return ("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<fuck bits=\"8\" wrap=\"Y\" signed=\"N\">\n");
  }

  private String intend()
  {
    String indentation = "";
    for(int index = 0; index < _indentation; index++)
      indentation += _tabChars;
    return (indentation);
  }

  public void setTabChars(String tabChars)
  {
    _tabChars = tabChars;
  }

  public String getTabChars()
  {
    return (_tabChars);
  }

}
