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
class MyClass {
    private String str;

    // This constructor takes an argument.
    MyClass(String s) { str = s; }

    // This is the default constructor.
    MyClass() { str = ""; }

    // ...

    String getStr() { return str; }
} 
