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

public class Question6_ReidAmrhein {
    
    /*****************************sumEven****************************
* Description: Stores list of numbers into an array, and then returns the
* sum of all even numbers
*
* Parameters:
* A (input) - array of integers
* n (input) - number of elements being evaluated
*
* Pre: if A is not empty 
*
* Returns: Sum of all even numbers
*
* Called by: main
* Calls: sumEven

* Running Time Analysis:
* Let n be the number of elements in the array.
* Each recursive call processes one element.
*
* Recurrence:
* T(n) = T(n - 1) + c

* Space Complexity:
* O(n) due to recursion stack.
********************************************************************/
    
    public static int sumEven(int[] A, int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        if (A[n - 1] % 2 == 0) {
            return A[n - 1] + sumEven(A, n - 1);
        } 
        else {
            return sumEven(A, n - 1);
        }
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = input.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        int result = sumEven(A, n);

        System.out.println("Sum of even numbers: " + result);
        // closes scanner
        input.close();
    }
}