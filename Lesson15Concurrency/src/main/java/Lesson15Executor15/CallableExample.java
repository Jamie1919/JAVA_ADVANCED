/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15Executor15;


/**
 *
 * @author jaypr
 */

// Java program to illustrate Callable
// to return a random number
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
  
//Public class CallableExample implements Callable
//{
//  
//    public Object call() throws Exception
//    {
//        // Create random number generator
//        Random generator = new Random();
//  
//        Integer randomNumber = generator.nextInt(5);
//  
//        // To simulate a heavy computation,
//        // we delay the thread for some random time
//        Thread.sleep(randomNumber * 1000);
//  
//        return randomNumber;
//    }
//}
