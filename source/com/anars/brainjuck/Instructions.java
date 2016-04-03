/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Instructions - Brainfuck Instructions
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

public enum Instructions
{
  LOOP_START('['),
  LOOP_END(']'),
  INCREASE_VALUE('+'),
  DECREASE_VALUE('-'),
  MOVE_POINTER_RIGHT('>'),
  MOVE_POINTER_LEFT('<'),
  OUTPUT_VALUE('.'),
  INPUT_VALUE(','),
  DUMP_MEMORY('#');
  // ---
  private char _command;

  private Instructions(char command)
  {
    _command = command;
  }

  public char getCommand()
  {
    return (_command);
  }
}
