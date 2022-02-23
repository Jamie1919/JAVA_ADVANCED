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
 
import userfuncs.binaryfuncs.BinaryFunc; 
 
public class AbsMinus implements BinaryFunc { 
 
  // Return name of this function. 
  public String getName() { 
    return "absMinus"; 
  } 
 
  // Implement the AbsMinus function. 
  public int func(int a, int b) { return Math.abs(a) - Math.abs(b); } 
}