/*************************************************************************
* Assignment 3 for CSCI 271-001 Spring 2026
*
* Author: Reid Amrhein
* OS: Mac
* Compiler: javac 25.0.1
* Date: February 21, 2026
*
* Purpose
* We are using recursion to simplify and solve problems
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Reid Amrhein>
* Said not to include Student ID, so I didn't include it
********************************************************************/

import java.util.Scanner;

public class Question5_ReidAmrhein {
    
    /*****************************reverse****************************
    * Description: Recursively reverses a string.
    *
    * Parameters:
    * s (input) - string to reverse
    * n (input) - index position
    *
    * Pre: if s not null
    * Post: Returns reversed string
    *
    * Returns: reversed string
    *
    * Called by: main
    * Calls: reverse
    /************************************************************************/
    
    public static String reverse(String s, int n) {
        // Base case
        if (n < 0) {
            return "";
        }

        // Recursive case
        return s.charAt(n) + reverse(s, n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String result = reverse(s, s.length() - 1);

        System.out.println("The string in reverse: " + result);
        // closes scanner
        input.close();
    }
}