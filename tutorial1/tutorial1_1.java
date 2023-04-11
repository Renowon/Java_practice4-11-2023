/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial1;

import javax.swing.JOptionPane; // JOptionPane.showInputdialog was not defined initially as JOptionPane class is not known
                                //  Press ctrl + shift + i to automatically import the required class


/**
 *
 * @author Renn
 */
public class tutorial1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String value = JOptionPane.showInputDialog("Enter something:");     // Cannot find symbol error appears 
                                                                                   // If i didn't import the class -> crtl + shift + i
        System.out.println(value);
    }
    
}

// Q1. What I did
// Ans: I've created the package tutorial1 and class Tutorial1.
// From here, the package name should be in all lowercase letters. 
// And period is not allowed (I've tried it) IF I USE NUMBER RIGHT AFTER!!!
// Usage of period is okay if period is followed by letters
// Use underscore if you want to use number right after the literal
// If I need to use multiple words, I can separate them with underscores or periods
// and it is common to use periods -> com.example.package_name
// class names should start with a capital letter and use camel case.
// ex) MyClass, MyClassName

// Q2. What I learned
// When I use JOptionPane.showInputDialog, error msg was given. 
// It was because JOptionPane class was not yet been known so that I import the required class by using ctrl + shift + i
// and the required class was automatically created
// It feels like I should use alt + shift + f, ctrl + space and ctrl + shift  + i usually as these are really helpful
// alt + shift + f: organizing codes to be properly formatted
// ctrl + space: show potential codes -> I can use it if I forgot the spelling of certain class/method/variable or codes
// crtl + shift + i: automatically import classes that are used in my codes.