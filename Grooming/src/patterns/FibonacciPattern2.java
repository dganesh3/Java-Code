package patterns;

import java.util.Scanner;

public class FibonacciPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = sc.nextInt();

        // Generate Fibonacci series
        int[] fibonacci = new int[terms];
        fibonacci[0] = 1;
        fibonacci[1] = 2;

        for (int i = 2; i < terms; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print in the given pattern
        int spaces = 0;
        boolean isPair = true;

        for (int i = 0; i < terms; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print number or pair
            if (isPair && i < terms - 1) {
                System.out.println(fibonacci[i] + "      " + fibonacci[i + 1]);
                i++;
            } else {
                System.out.println(fibonacci[i]);
            }

            spaces++;
            isPair = !isPair;
        }

        sc.close();
    }
}
