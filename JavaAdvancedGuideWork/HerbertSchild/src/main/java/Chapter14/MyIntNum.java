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
// This class stores an int value and defines the instance
// method isFactor(), which returns true if its argument
// is a factor of the stored value.
class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }

    int getNum() { return v; }

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
