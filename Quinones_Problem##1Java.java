/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinones_problem1.java;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class Quinones_Problem1Java {

    /**
     * @param args the command line arguments
     */
    // Recursive method to calculate the sum of the digits of a number
    public static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        // Recursive step:
        // (number % 10) gets the last digit (e.g., 123 % 10 = 3)
        // sumOfDigits(number / 10) removes the last digit and repeats (e.g., 123 / 10 = 12)
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the keyboard
        Scanner input = new Scanner(System.in);
// Read an integer entered by the user
        int number = input.nextInt();
// Check if the number is negative
        if (number < 0) {
            System.out.println("MALIII, TRY AGAIN!");
        } else {
            // Call the recursive method and store the result
            int summation = sumOfDigits(number);
// Print the final sum
            System.out.println(summation);

        }
    }
}
