/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinones_problem2;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class QUINONES_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Tells the Scanner to ignore anything that isn't a number (0-9) or a minus sign (-).
        // This lets users type inputs like "12, 18" or "12 and 18" instead of just spaces.
        input.useDelimiter("[^0-9-]+");
// Read the two integers
        int a = input.nextInt();
        int b = input.nextInt();
// Calculate the GCD using the recursive method
        int result = gcd(a, b);
// Validate input: check for negative numbers
        if (a < 0 || b < 0) {
            System.out.print("Invalid input");
// Check for the special case where both numbers are zero
        } else if (a == 0 && b == 0) {
            System.out.println("Undefined - handle in main()");
// Otherwise, print the calculated GCD
        } else {
            System.out.println(result);
        }
        input.close();
    }
// Recursive method to find the Greatest Common Divisor using the Euclidean Algorithm
    public static int gcd(int a, int b) {
        // Base case: when the remainder (b) reaches 0, 'a' is the GCD
        if (b == 0) {
            return a;
        }
        // Recursive step: replace 'a' with 'b', and 'b' with the remainder of 'a / b'
        return gcd(b, a % b);
    }
}
