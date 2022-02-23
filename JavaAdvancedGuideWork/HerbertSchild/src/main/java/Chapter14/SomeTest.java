/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

/**
 *
 * @author jaypr
 */
// A generic functional interface with two parameters
// that returns a boolean result.
interface SomeTest<T> {
    boolean test(T n, T m);
}
