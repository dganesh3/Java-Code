package patterns;

import java.util.Scanner;

public class FibonacciVPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first and second numbers for Fibonacci series
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        System.out.print("Enter the number of lines for the pattern: ");
        int lines = sc.nextInt();

        // Generate Fibonacci series
        int[] fibonacci = new int[lines * 2 - 1];
        fibonacci[0] = first;
        fibonacci[1] = second;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print V-pattern
        int left = 0, right = (lines * 2) - 2; // Initialize indices for the V shape
        for (int i = 0; i < lines; i++) 
        {
            for (int j = 0; j <= right; j++) 
            {
                if (j == left) 
                {
                    System.out.print(fibonacci[left]); // Print left number
                } else if (j == right) {
                    System.out.print(fibonacci[right]); // Print right number
                } else {
                    System.out.print(" "); // Print spaces
                }
            }
            System.out.println();
            left++;
            right--;
        }

        sc.close();
    }
}
