/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

/**
 *
 * @author Renn
 */
public class tutorial2_1 {
    public static void main(String[] args) {        
        MonteCarloMethod.method1();   
        
        MonteCarloMethod c2 = new MonteCarloMethod();
        c2.method2();
    }
}

// Q1. What I did
// Compute the value of pi using Monte Carlo Method
// Math.PI (The real value of PI), Math.random() (0 <= value < 1, which means that 0 is inclusive and 1 is exclusive)
// Using two different classes and use main method as just calling purpose and another class as function behavior

// Q2. What I learned
// In case of static class, no need to create object when it comes to using it in other class.
// In case of normal class, without static property, I need to create object before I call it in the other class