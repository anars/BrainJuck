/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Converter - Brainfuck to Java Converter Version 1.0
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.net.URL;
import java.net.URLClassLoader;

import java.util.Arrays;
import java.util.Calendar;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Converter
{
  public Converter(File brainfuckFile, File outputPath, String javaPackage, String javaClass, int executionSteps, int outputFormat, boolean debugTrace)
  {
    super();
    String input = null;
    BufferedReader bufferedReader = null;
    try
    {
      bufferedReader = new BufferedReader(new FileReader(brainfuckFile));
      StringBuilder stringBuilder = new StringBuilder();
      String line = bufferedReader.readLine();
      while(line != null)
      {
        stringBuilder.append(line.replaceAll("[^\\[\\]\\<\\>\\+\\-\\.\\,]", "") + "\0");
        line = bufferedReader.readLine();
      }
      input = stringBuilder.toString();
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
    if(input.replaceAll("[^\\[]", "").length() != input.replaceAll("[^\\]]", "").length())
      errorExit("while paran", -1);
    String code = null;
    boolean movePointerRight = false;
    boolean movePointerLeft = false;
    boolean increaseCellValue = false;
    boolean decreaseCellValue = false;
    boolean expandArray = false;
    boolean getCellValue = false;
    boolean inputIntoCurrentCell = false;
    boolean outputCurrentCell = false;
    {
      StringBuilder stringBuilder = new StringBuilder();
      int indentation = 2;
      int counter = 0;
      char countedCommand = '\0';
      for(int index = 0; index < input.length(); index++)
      {
        char command = input.charAt(index);
        if(command == '+' || command == '-' || command == '>' || command == '<')
        {
          if(countedCommand == '\0' || countedCommand == command)
          {
            counter++;
            countedCommand = command;
            command = '\0';
          }
          else
          {
            command = countedCommand;
            countedCommand = '\0';
            index--;
          }
        }
        else if(countedCommand != '\0')
        {
          command = countedCommand;
          countedCommand = '\0';
          index--;
        }
        switch(command)
        {
          case '+':
          case '-':
            stringBuilder.append(intent(indentation));
            stringBuilder.append((command == '+' ? "in" : "de") + "creaseCellValue(" + counter + ");\n");
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\"" + repeatChar(counter, command) + "\");\n");
            }
            counter = 0;
            increaseCellValue |= (command == '+');
            decreaseCellValue |= (command == '-');
            expandArray = true;
            break;
          case '>':
          case '<':
            stringBuilder.append(intent(indentation));
            stringBuilder.append("movePointer" + (command == '>' ? "Right" : "Left") + "(" + counter + ");\n");
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\"" + repeatChar(counter, command) + "\");\n");
            }
            counter = 0;
            movePointerRight |= (command == '>');
            movePointerLeft |= (command == '<');
            break;
          case '.':
            stringBuilder.append(intent(indentation));
            stringBuilder.append("outputCurrentCell();\n");
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\".\");\n");
            }
            outputCurrentCell = true;
            getCellValue = true;
            break;
          case ',':
            stringBuilder.append(intent(indentation));
            stringBuilder.append("inputIntoCurrentCell();\n");
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\",\");\n");
            }
            inputIntoCurrentCell = true;
            expandArray = true;
            break;
          case '[':
            stringBuilder.append(intent(indentation));
            stringBuilder.append("while((getCellValue() & 0xFF) != 0) {\n");
            indentation++;
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\"[\");\n");
            }
            getCellValue = true;
            break;
          case ']':
            if(debugTrace)
            {
              stringBuilder.append(intent(indentation));
              stringBuilder.append("debugTrace(\"]\");\n");
            }
            indentation--;
            stringBuilder.append(intent(indentation));
            stringBuilder.append("}");
            stringBuilder.append("\n");
            break;
        }
      }
      code = stringBuilder.toString();
    }
    StringBuilder stringBuilder = new StringBuilder();
    File packagePath = outputPath;
    if(javaPackage != null)
    {
      stringBuilder.append("package ");
      stringBuilder.append(javaPackage);
      stringBuilder.append(";\n\n");
      packagePath = new File(outputPath, javaPackage.replaceAll("[.]", File.separator));
      if(!packagePath.exists() && !packagePath.mkdir())
        errorExit("mkdirs", -1);
    }
    stringBuilder.append("public class ");
    stringBuilder.append(javaClass);
    stringBuilder.append(" {\n");
    if(expandArray || getCellValue)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private byte[] _array = new byte[0];\n");
    }
    stringBuilder.append(intent(1));
    stringBuilder.append("private int _pointer = 0;\n");
    stringBuilder.append(intent(1));
    if(outputFormat != 0)
      stringBuilder.append("private boolean _space = false;\n");
    stringBuilder.append("\n");
    stringBuilder.append(intent(1));
    stringBuilder.append("public ");
    stringBuilder.append(javaClass);
    stringBuilder.append("() {\n");
    stringBuilder.append(code);
    if(outputFormat != 0)
    {
      stringBuilder.append(intent(2));
      stringBuilder.append("System.out.println();\n");
    }
    stringBuilder.append(intent(1));
    stringBuilder.append("}\n");
    stringBuilder.append("\n");
    stringBuilder.append(intent(1));
    stringBuilder.append("public static void main(String[] args) {\n");
    stringBuilder.append(intent(2));
    stringBuilder.append("new ");
    stringBuilder.append(javaClass);
    stringBuilder.append("();\n");
    stringBuilder.append(intent(1));
    stringBuilder.append("}\n");
    stringBuilder.append("\n");
    if(movePointerRight)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void movePointerRight(int steps) {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("_pointer += steps;\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(movePointerLeft)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void movePointerLeft(int steps) {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("_pointer -= steps;\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("if (_pointer < 0)\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("_pointer = 0;\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(increaseCellValue)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void increaseCellValue(int amount) {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("expandArray();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("_array[_pointer] += amount;\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(decreaseCellValue)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void decreaseCellValue(int amount) {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("expandArray();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("_array[_pointer] -= amount;\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(expandArray)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void expandArray() {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("if (_pointer >= _array.length) {\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("byte[] newArray = new byte[_pointer + 1];\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("System.arraycopy(_array, 0, newArray, 0, _array.length);\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("_array = newArray;\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("}\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(getCellValue)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private byte getCellValue() {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("if (_pointer >= _array.length)\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("return (0);\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("return (_array[_pointer]);\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(inputIntoCurrentCell)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void inputIntoCurrentCell() {\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("expandArray();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("try\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("{\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("_array[_pointer] = (byte)System.in.read();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("}\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("catch(Exception exception)\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("{\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("exception.printStackTrace();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("}\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(outputCurrentCell)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void outputCurrentCell() {\n");
      stringBuilder.append(intent(2));
      if(outputFormat == 0)
      {
        stringBuilder.append("System.out.print((char)(getCellValue() & 0xFF));\n");
      }
      else if(outputFormat == 1)
      {
        // hexadecimal without leading zeroes
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toBinaryString(getCellValue()));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 2)
      {
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toBinaryString(0b100000000 | getCellValue()).substring(1));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 3)
      {
        // hexadecimal without leading zeroes
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toOctalString(getCellValue()));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 4)
      {
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toOctalString(01000 | getCellValue()).substring(1));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 5)
      {
        // decimal without leading zeroes
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + (0xff & getCellValue()));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 6)
      {
        // decimal with leading zeroes
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toString(1000 + (0xff & getCellValue())).substring(1));\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 7)
      {
        // hexadecimal without leading zeroes
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toHexString(getCellValue()).toUpperCase());\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      else if(outputFormat == 8)
      {
        stringBuilder.append("System.out.print((_space ? \" \" : \"\") + Integer.toHexString(0x100 | getCellValue()).substring(1).toUpperCase());\n");
        stringBuilder.append(intent(2));
        stringBuilder.append("_space = true;\n");
      }
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
      stringBuilder.append("\n");
    }
    if(debugTrace)
    {
      stringBuilder.append(intent(1));
      stringBuilder.append("private void debugTrace(String command)\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("{\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("System.out.println(\"Command : \" + command);\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("for(int index = 0; index < (_array.length / 8) + 1; index++)\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("{\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("for(int offset = 0; offset < 8; offset++)\n");
      stringBuilder.append(intent(4));
      stringBuilder.append("if(index * 8 + offset < _array.length)\n");
      stringBuilder.append(intent(5));
      stringBuilder.append("System.out.print((index * 8 + offset == _pointer ? \"{\" : \" \")  + Integer.toString(1000 + (0xff & _array[index * 8 + offset])).substring(1) + (index * 8 + offset == _pointer ? \"}\" : \" \"));\n");
      stringBuilder.append(intent(4));
      stringBuilder.append("else\n");
      stringBuilder.append(intent(5));
      stringBuilder.append("System.out.print((index * 8 + offset == _pointer ? \"{\" : \" \") + \"000\" + (index * 8 + offset == _pointer ? \"}\" : \" \"));\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("System.out.print(\"\\t\");\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("for(int offset = 0; offset < 8; offset++)\n");
      stringBuilder.append(intent(4));
      stringBuilder.append("if(index * 8 + offset < _array.length)\n");
      stringBuilder.append(intent(5));
      stringBuilder.append("if((char)(_array[index * 8 + offset] & 0xFF) > 31)\n");
      stringBuilder.append(intent(6));
      stringBuilder.append("System.out.print((index * 8 + offset == _pointer ? \"{\" : \" \") + (char)(_array[index * 8 + offset] & 0xFF) + (index * 8 + offset == _pointer ? \"}\" : \" \"));\n");
      stringBuilder.append(intent(5));
      stringBuilder.append("else\n");
      stringBuilder.append(intent(6));
      stringBuilder.append("System.out.print((index * 8 + offset == _pointer ? \"{\" : \" \") + \".\" + (index * 8 + offset == _pointer ? \"}\" : \" \"));\n");
      stringBuilder.append(intent(4));
      stringBuilder.append("else\n");
      stringBuilder.append(intent(5));
      stringBuilder.append("System.out.print((index * 8 + offset == _pointer ? \"{\" : \" \") + \".\" + (index * 8 + offset == _pointer ? \"}\" : \" \"));\n");
      stringBuilder.append(intent(3));
      stringBuilder.append("System.out.println();\n");
      stringBuilder.append(intent(2));
      stringBuilder.append("}\n");
      stringBuilder.append(intent(1));
      stringBuilder.append("}\n");
    }
    stringBuilder.append("}\n");
    PrintWriter printWriter = null;
    try
    {
      printWriter = new PrintWriter(new File(packagePath, javaClass + ".java"));
      printWriter.print(stringBuilder.toString());
      printWriter.close();
    }
    catch(Exception exception)
    {
      System.out.println(exception);
      errorExit("printWriter", -1);
    }
    if(executionSteps > 1)
      try
      {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(new File(packagePath, javaClass + ".java")));
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits);
        (new File(packagePath, javaClass + ".class")).delete();
        boolean success = task.call();
        fileManager.close();
      }
      catch(IOException ioe)
      {
        // TODO: Add catch code
        ioe.printStackTrace();
      }
    if(executionSteps > 2)
      try
      {
        (new URLClassLoader(new URL[]
          {
            outputPath.toURI().toURL()
          })).loadClass((javaPackage == null ? "" : javaPackage + ".") + javaClass).getConstructor().newInstance();
      }
      catch(Exception iae)
      {
        // TODO: Add catch code
        iae.printStackTrace();
      }
  }
  private String intent(int indentation)
  {
    return (repeatChar(indentation, '\t'));
  }

  private String repeatChar(int times, char character)
  {
    StringBuilder stringBuilder = new StringBuilder();
    for(int index = 0; index < times; index++)
      stringBuilder.append(character);
    return (stringBuilder.toString());
  }

  public static void main(String[] args)
  {
    if(args.length == 0)
      helpExit();
    File brainfuckFile = null;
    File outputPath = null;
    String javaPackage = null;
    String javaClass = null;
    int executionSteps = 3;
    int outputFormat = 0;
    boolean debugTrace = false;
    for(int index = 0; index < args.length; index++)
    {
      String values[] = args[index].split("=");
      values[0] = values[0].toLowerCase();
      if(values[0].equals("-brainfuck-file"))
      {
        brainfuckFile = new File(values[1]);
      }
      else if(values[0].equals("-output-path"))
      {
        outputPath = new File(values[1]);
      }
      else if(values[0].equals("-java-package"))
      {
        javaPackage = values[1];
      }
      else if(values[0].equals("-java-class"))
      {
        javaClass = values[1];
      }
      else if(values[0].equals("-execution-steps"))
      {
        executionSteps = Integer.parseInt(values[1]);
        if(executionSteps < 1 || executionSteps > 3)
          errorExit(values[0] + " value must be between 1 and 3", -1);
      }
      else if(values[0].equals("-output-format") || values[0].equals("-of"))
      {
        outputFormat = Integer.parseInt(values[1]);
        if(outputFormat < 0 || outputFormat > 8)
          errorExit(values[0] + " value must be between 0 and 8", -1);
      }
      else if(values[0].equals("-debug-trace"))
      {
        debugTrace = true;
      }
      else if(values[0].equals("-help") || values[0].equals("-h"))
      {
        helpExit();
      }
      else
        errorExit("Unknown parameter \"" + args[index] + "\"", -6);
    }
    if(brainfuckFile == null)
      errorExit("no input file", -6);
    if(outputPath == null)
      outputPath = new File(System.getProperty("user.dir"));
    if(javaClass == null)
    {
      javaClass = brainfuckFile.getName();
      javaClass = javaClass.substring(0, javaClass.indexOf("."));
      javaClass = javaClass.substring(0, 1).toUpperCase() + javaClass.substring(1);
    }
    new Converter(brainfuckFile, outputPath, javaPackage, javaClass, executionSteps, outputFormat, debugTrace);
  }
  private static void errorExit(String message, int errorCode)
  {
    System.err.println(message + ". Please type -help for details.");
    System.exit(errorCode);
  }

  private static void helpExit()
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
