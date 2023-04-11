/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

import javax.swing.JOptionPane;

/**
 *
 * @author Renn
 */
public class MonteCarloMethod {

    private static double pi = 0;
    private static int insideNum = 0;

    public static void method1() {
        System.out.println("This program approximates PI using the Monte Carlo Method.");

        String stringNum = JOptionPane.showInputDialog("Pleawse enter the number of throws (n)");
        int intNum = Integer.parseInt(stringNum);

        for (int i = 0; i < intNum; i++) {
            // assume that the radius is 0.5 and length of square is 1
            double xValue = Math.random();      // x-coordinate
            double yValue = Math.random();      // y-coordinate
            
            if(Math.sqrt(xValue*xValue + yValue*yValue) <= 1) {
                insideNum++;
            }
        }
        
        pi = (4.0 * insideNum / intNum);
        
        System.out.printf("Computed PI = " + pi + ", Difference = " + (pi - Math.PI));
    }
    
    public void method2() {
        System.out.println("You should create an object first if you want to use this method in the other class");
    }
}
