/**
 * BrainJuck - Rapid Application Development with only 3 bits!
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
  public static final double VERSION = 1.1;
  
  public Main()
  {
    super();
  }

  public static void main(String[] args)
  {
    String submodule = (args.length > 0 ? args[0].toLowerCase() : "");
    if(submodule.equals("interpreter"))
    {
      boolean debug = false;
      File sourceFile = null;
      if(args.length == 2)
      {
        sourceFile = new File(args[1]);
      }
      else if(args.length == 3)
      {
        if(args[1].equalsIgnoreCase("-debug"))
          debug = true;
        else
          help();
        sourceFile = new File(args[2]);
      }
      else
      {
        help();
      }
      new Interpreter(sourceFile, debug);
    }
    else if(submodule.equals("optimizer"))
    {
      int lineWrap = 80;
      File inputFile = null;
      File outputFile = null;
      if(args.length == 3)
      {
        inputFile = new File(args[1]);
        outputFile = new File(args[2]);
      }
      else if(args.length == 4)
      {
        if(args[1].toLowerCase().startsWith("-lineWrap="))
        {
          try
          {
            lineWrap = Integer.parseInt(args[1].substring(args[1].lastIndexOf("=") + 1));
            if(lineWrap < 0)
              errorExit("Invalid -lineWrap value.", -1);
          }
          catch(Exception exception)
          {
            errorExit("Invalid -lineWrap value.", -1);
          }
        }
        else
        {
          help();
        }
        inputFile = new File(args[2]);
        outputFile = new File(args[3]);
      }
      else
      {
        help();
      }
      new Optimizer(inputFile, outputFile, lineWrap);
    }
    else if(submodule.equals("formatter"))
    {
      int tabSize = 0;
      File inputFile = null;
      File outputFile = null;
      if(args.length == 3)
      {
        inputFile = new File(args[1]);
        outputFile = new File(args[2]);
      }
      else if(args.length == 4)
      {
        if(args[1].toLowerCase().startsWith("-tabSize="))
        {
          try
          {
            tabSize = Integer.parseInt(args[1].substring(args[1].lastIndexOf("=") + 1));
            if(tabSize < 0)
              errorExit("Invalid -tabSize value.", -1);
          }
          catch(Exception exception)
          {
            errorExit("Invalid -tabSize value.", -1);
          }
        }
        else
        {
          help();
        }
        inputFile = new File(args[2]);
        outputFile = new File(args[3]);
      }
      else
      {
        help();
      }
      new Formatter(inputFile, outputFile, tabSize);
    }
    else if(submodule.equals("generator"))
    {
      File inputFile = null;
      File outputFile = null;
      if(args.length == 3)
      {
        inputFile = new File(args[1]);
        outputFile = new File(args[2]);
      }
      else
      {
        help();
      }
      new Generator(inputFile, outputFile);
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
    System.out.println("\nBrainJuck Version " + VERSION + " - Rapid Application Development with only 3 bits!\n" + //
      "Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Anar Software LLC. < http://anars.com >\n\n" + //
      "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n\n" + //
      "This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.\n" + //
      "See the GNU General Public License for more details at http://www.gnu.org/licenses\n\n" + //
      "USAGE:\n" + //
      "\tjava -jar BrainJuck.jar (interpreter|optimizer|formatter|generator) [PARAMETERS...]\n\n" + //
      "SUBMODULES:\n" + //
      "\ninterpreter\n" + //
      "\tInterprets Brainfuck source code.\n\n" + //
      "\tUSAGE:\n" + //
      "\tjava -jar BrainJuck.jar interpreter [-debug] source_file\n" + //
      "\n\tDESCRIPTION:\n" + //
      "\t-debug   Enables debug command (#).\n" + //
      //
      "\noptimizer\n" + //
      "\tStrips and optimizes Brainfuck source code.\n\n" + //
      "\tUSAGE:\n" + //
      "\tjava -jar BrainJuck.jar optimizer [-lineWrap=#] input_source_file output_source_file\n" + //
      "\n\tDESCRIPTION:\n" + //
      "\t-lineWrap=#   Wrap lines after #th characters.\n" + //
      //
      "\nformatter\n" + //
      "\tIndents and formats Brainfuck source code.\n\n" + //
      "\tUSAGE:\n" + //
      "\tjava -jar BrainJuck.jar formatter [-tabSize=#] input_source_file output_source_file\n" + //
      "\n\tDESCRIPTION:\n" + //
      "\t-tabSize=#   Number (#) of whitespaces for each indentation. if # is zero (0), uses tab character (\\t).\n" + //
      //
      "\ngenerator\n" + //
      "\tConverts text file to Brainfuck source code.\n\n" + //
      "\tUSAGE:\n" + //
      "\tjava -jar BrainJuck.jar generator input_text_file output_source_file\n");
    System.exit(0);
  }
}
