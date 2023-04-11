/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1;

import javax.swing.JOptionPane;

/**
 *
 * @author Renn
 */
public class tutorial1_2 {

    public static void main(String[] args) {
        System.out.println("Will it be executed?");  // yes. this refers to the fact that 
        // I can use multiple classes with main method as I can specify the class
        // to run
        String value = JOptionPane.showInputDialog("Enter something:");
        double halfValue = Double.parseDouble(value) / 2;
        System.out.printf("Halve the value: %.2f\n", halfValue);
        
        PrintLetter();
        
        System.out.println(hasTriples(new int[] {1, 1, 2, 2, 1}));
        System.out.println(hasTriples(new int[] {1, 1, 2, 2, 2, 1}));
        System.out.println(hasTriples(new int[] {1, 1, 1, 2, 2, 2, 1}));
        
        printPyramid();
    }

    public static void PrintLetter() {      // Design a Java method (function) to print letters from A to Z using a for-loop.(Hints: You can 
        // manipulate a character as a number. Try to figure out the numerical difference between A and B.)        

        // 1st method
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('A' + i) + " ");
        }

        System.out.println("");
        // 2nd method
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("");
    }

    public static boolean hasTriples(int nums[]) {

       

        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if(a == nums[i + 1] && a == nums[i + 2]) return true;
        }
        return false;
    }
    
    public static void printPyramid() {
        
        int intNum;
        
        do {
            String stringNum = JOptionPane.showInputDialog("Enter the number between 1 to 15:");
            intNum = Integer.parseInt(stringNum);
        } while(intNum > 15 || intNum < 1);
        
        for(int row = 0; row < intNum; row++) {
            // need to think about leading space, starting number and ending number
            for(int column = 0; column < row; column++) {
                System.out.print("   ");
            }
            for(int num = intNum - row; num > 0; num--) {
                System.out.printf("%3d", num);
            }
            for(int num = 2; num <= intNum - row; num++) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
        
    }
}

// Q1. What I did?
// Same as previous class but the difference is that I've used Double halfValue = Double.parseDouble(value) / 2;
// And &.2f codes.
// Double halfValue = Double.parseDouble(value) / 2; // this code means that convert the string value into double and then halve it
// Finally divide it by two and store it in identifier halfValue
// %.2f -> this means that floating number with two decimnal places

// In PrintLetter() method, I used two method. Using (char)('A' + i) so that finally convert it in char
// And just represent it without form conversion. I can do for(char c = 'A'; c < 'Z'; c++). then c change its form in letter, not int

// IN hasTriples() method, I need to add parameter as it needs initial array.
// int[] nums or int num [] are both okay. This array part would be dealt with later on as this usage of array is just basic

// In printPyramid part, the essential thing was using "%3d". 
// It guarantees three spaces so that no need to think of how many spaces would need for each cases.

// Q2. What I learned
// static method can be only accessed by static method. Otherwise, there is an error
// the program ends if it met return. No need to write code 'break;' to shorten the time 
// I initialized all methods with public static void. But what if I initialize it with private?
// There is no difference between them in the smae class where they've been defined.
// But the thing is that if I want to use it in different class, then I need to define it with public, not private.
// By the way, I can use JOptionPane.showInputDialog() when I want input. The class would be automatically added with the help of ctrl + space

// Things I want more
// How can I use the debug mode and what is the purpose of it?
// chatGPT said it is a powerful tool to figure out what is the error or examine the values of variables.
// Actually still cannot catch the main purpose as I don't confront with such a hard errors so far