/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15.mymodapp.userfuncsimp;

/**
 *
 * @author jaypr
 */
package userfuncsimp.binaryfuncsimp; 
 
import userfuncs.binaryfuncs.*; 
 
public class AbsPlusProvider implements BinFuncProvider { 
 
  // Provide an AbsPlus object. 
  public BinaryFunc get() { return new AbsPlus(); } 
}