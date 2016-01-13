/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Main / Parameter Parser Class for BrainJuck Tools - Version 1.0
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

import java.util.Calendar;

public class Main
{
  public Main()
  {
    super();
  }

  public static void main(String[] args)
  {
    new Interpreter(new File(args[0]), true);
    // Main main = new Main();
  }
  
  protected void helpExit(String programName, String programVersion)
  {
    System.out.println("\nBrainJuck - A Set of Brainfuck tools are written in Java\n" + //
      programName + " Version " + programVersion + "\n\n" + //
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
