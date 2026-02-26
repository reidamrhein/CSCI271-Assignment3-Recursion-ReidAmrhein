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

public class Question4_ReidAmrhein {
    
    /*****************************countDigits****************************
* Description: Recursively counts how many times digit D appears 
* in number N.
*
* Parameters:
* s (input) - the string being evaluated
* n (input) - number of characters remaining to check
*
* Pre: if s is not null, n >= 0
* Post: Returns the total number of digit characters in the string.
*
* Returns: integer representing digit count
*
* Called by: main
* Calls: countDigits

* Running Time Analysis:
* Let n be the number of digits in N.
* Each recursive call removes one digit using N / 10.
*
* Recurrence:
* T(n) = T(n - 1) + c

* Space Complexity:
* O(n) due to recursion depth.
********************************************************************/
    
    public static int countDigit(long N, int D) {
        // Base case
        if (N == 0) {
            return 0;
        }

        // Recursive case
        if (N % 10 == D) {
            return 1 + countDigit(N / 10, D);
        } 
        else {
            return countDigit(N / 10, D);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a very big number: ");
        long N = input.nextLong();

        System.out.print("Enter a digit (0-9): ");
        int D = input.nextInt();

        int result = countDigit(N, D);

        System.out.println("D occurs inside of N " + result + " times.");
        // closes scanner
        input.close();
    }
}