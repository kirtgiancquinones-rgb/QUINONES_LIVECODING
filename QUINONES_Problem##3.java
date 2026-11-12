/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinones_problem3;

import static java.lang.Character.UnicodeScript.values;
import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class QUINONES_Problem3 {

    /**
     * @param args the command line arguments
     */
    public class RecursiveArrayAnalysis {

        // Method 1: Calculate the sum of array elements
        public static int arraySum(int[] values, int index) {

            // Base case: moved past the first element (index 0)
            if (index == values.length) {
                return 0;
            }

            // Add the current element to the sum of everything before it
            return values[index] + arraySum(values, index + 1);
        }

        // Method 2: Find the largest element using Math.max and backward recursion
        public static int findMaximum(int[] values, int index) {

            // Base case: only the first element (index 0) is left to check
            if (index == values.length - 1) {
                return values[index];
            }

            // Recursive case: find the maximum of remaining elements
            int maximumOfRest = findMaximum(values, index + 1);

            // Compare current element with the maximum of the rest
            if (values[index] > maximumOfRest) {
                return values[index];
            } else {
                return maximumOfRest;
            }
        }

        // Method 3: Count the even elements
        public static int countEven(int[] values, int index) {

            // Base case: stop when index reaches array length
            if (index == values.length) {
                return 0;
            }

            // Check if the current element is even
            int currentCount = 0;

            if (values[index] % 2 == 0) {
                currentCount = 1;
            }

            // Recursive case: count the remaining even elements
            return currentCount + countEven(values, index + 1);
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of array elements: ");
            int size = input.nextInt();

            // Validate array size
            if (size <= 0) {
                System.out.println("Invalid array size! Enter at least one element.");
            } else {

                int[] values = new int[size];

                // Read array elements
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    values[i] = input.nextInt();
                }

                // Perform all calculations using recursion
                int sum = arraySum(values, 0);
                int maximum = findMaximum(values, 0);
                int evenCount = countEven(values, 0);

                // Display results in main()
                System.out.println("\nArray Analysis Results:");
                System.out.println("Array Sum: " + sum);
                System.out.println("Largest Element: " + maximum);
                System.out.println("Number of Even Elements: " + evenCount);
            }

            input.close();
        }
    }
}
