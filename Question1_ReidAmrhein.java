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

public class Question1_ReidAmrhein {

     /*****************************recursiveLength****************************
    * Description: Recursively computes the length of a string.
    *
    * Parameters:
    * s (input)  - the string whose length is being computed
    * n (input)  - number of characters remaining to evaluate
    *
    * Pre: If s is not null, n >= 0
    * Post: Returns the number of characters in s
    *
    * Returns: integer length of the string
    *
    * Called by: main
    * Calls: recursiveLength
    * 
    *  Running Time Analysis:
    * Let n be the length of the string.
    * Each recursive call reduces n by 1 and performs constant work.
    *
    * Recurrence relation:
    * T(n) = T(n - 1) + c
    * 
    * * Space Complexity:
    * O(n) due to recursive call stack.
    ************************************************************************/

  
    
    public static int recursiveLength(String s, int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        else {
            return 1 + recursiveLength(s, n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // opens scanner for user input

        System.out.print("Enter a string: ");
        String s = input.nextLine(); // user input string

        int length = recursiveLength(s, s.length());
        System.out.println("Length of the string: " + length);

        // closes scanner
        input.close();
    }
}