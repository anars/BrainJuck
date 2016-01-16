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
    String submodule = args[0].toLowerCase();
    if(submodule.equals("interpreter"))
    {
      boolean debug = false;
      File sourceFile = null;
      for(int index = 1; index < args.length; index++)
        if(args[index].toLowerCase().equalsIgnoreCase("-debug"))
          debug = true;
        else if(args[index].toLowerCase().equalsIgnoreCase("-help"))
          interpreterHelp();
        else
          sourceFile = new File(args[index]);
      if(sourceFile == null)
        errorExit("Please specify Brainfuck source file.", -1);
      new Interpreter(sourceFile, debug);
    }
    else if(submodule.equals("optimizer"))
    {
      int lineWrap = 80;
      File inputFile = null;
      File outputFile = null;
      for(int index = 1; index < args.length; index++)
        if(args[index].toLowerCase().startsWith("-wrap="))
        {
          try
          {
            lineWrap = Integer.parseInt(args[index].substring(args[index].lastIndexOf("=") + 1));
            if(lineWrap < 0)
              errorExit("Invalid -wrap value.", -1);
          }
          catch(Exception exception)
          {
            errorExit("Invalid -wrap value.", -1);
          }
        }
        else if(args[index].equalsIgnoreCase("-help"))
        {
          optimizerHelp();
        }
        else if(inputFile == null)
        {
          inputFile = new File(args[index]);
        }
        else if(outputFile == null)
        {
          outputFile = new File(args[index]);
        }
        else
        {
          errorExit("invalid parameter " + args[index], -1);
        }
      if(inputFile == null)
        errorExit("Please specify Brainfuck input source file.", -1);
      if(outputFile == null)
        errorExit("Please specify Brainfuck output source file.", -1);
      new Optimizer(inputFile, outputFile, lineWrap);
    }
    else if(submodule.equals("formatter"))
    {
      int tabSize = 0;
      File inputFile = null;
      File outputFile = null;
      for(int index = 1; index < args.length; index++)
        if(args[index].toLowerCase().startsWith("-tab="))
        {
          try
          {
            tabSize = Integer.parseInt(args[index].substring(args[index].lastIndexOf("=") + 1));
            if(tabSize < 0)
              errorExit("Invalid -wrap value.", -1);
          }
          catch(Exception exception)
          {
            errorExit("Invalid -wrap value.", -1);
          }
        }
        else if(args[index].equalsIgnoreCase("-help"))
        {
          optimizerHelp();
        }
        else if(inputFile == null)
        {
          inputFile = new File(args[index]);
        }
        else if(outputFile == null)
        {
          outputFile = new File(args[index]);
        }
        else
        {
          errorExit("invalid parameter " + args[index], -1);
        }
      if(inputFile == null)
        errorExit("Please specify Brainfuck input source file.", -1);
      if(outputFile == null)
        errorExit("Please specify Brainfuck output source file.", -1);
      new Formatter(inputFile, outputFile, tabSize);
    }
    else if(submodule.equals("generator"))
    {
      if(args.length != 3)
        errorExit("Please specify input and output files.", -1);
      new Generator(new File(args[1]), new File(args[2]));
    }
    else
    {
      help();
    }
  }

  private static void errorExit(String message, int errorCode)
  {
    System.err.println(message + ". Please type -help for details.");
    System.exit(errorCode);
  }
  private static void help()
  {
    helpHeader();
    System.out.println("USAGE:\n" + //
      "\tjava -jar BrainJuck.jar SUBMODULE -help\n\n" + //
      "SUBMODULES:\n\n" + //
      "-interpreter\n" + //
      "\tInterpreters Brainfuck source code.\n" + //
      "-optimizer\n" + //
      "\tOptimizes Brainfuck source code.\n" + //
      "-formatter\n" + //
      "\tFormats Brainfuck source code.\n" + //
      "-generator\n" + //
      "\tConverts text file to Brainfuck source code.\n");
    System.exit(0);
  }

  private static void interpreterHelp()
  {
    helpHeader();
    System.out.println("Brainfuck Interpreter Version 1.0\n" + //
      "----------------------------\n\n" + //
      "USAGE:\n" + //
      "\tjava -jar BrainJuck.jar -interpreter [-debug] file\n" + //
      "\tjava -jar BrainJuck.jar -interpreter -help\n\n" + //
      "DESCRIPTION:\n\n" + //
      "-debug\n" + //
      "\tEnables debug (#) command\n" + //
      "-help\n" + //
      "\tDisplays this help\n");
    System.exit(0);
  }
  private static void optimizerHelp()
  {
  }

  private static void helpHeader()
  {
    System.out.println("\nBrainJuck - Rapid Application Development with only 3 bits!\n" + //
      "Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Anar Software LLC. < http://anars.com >\n\n" + //
      "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n\n" + //
      "This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.\n" + //
      "See the GNU General Public License for more details at http://www.gnu.org/licenses\n");
  }
}
