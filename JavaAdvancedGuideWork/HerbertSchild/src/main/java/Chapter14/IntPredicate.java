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
// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate {
    boolean test(int n);
}
