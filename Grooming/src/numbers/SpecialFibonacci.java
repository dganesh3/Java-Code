package numbers;

import java.util.Scanner;

public class SpecialFibonacci {

    // Function to compute the Nth number in the special series
    public static int specialFibonacci(int input1) {
        // Base cases
        if (input1 == 0 || input1 == 1) {
            return 1;
        }

        // Array to store the series up to N
        int[] series = new int[input1 + 1];

        // Initializing base values
        series[0] = 1;
        series[1] = 1;

        // Calculate the sequence for all values up to N
        for (int i = 2; i <= input1; i++) {
            series[i] = (series[i - 1] * series[i - 1] + series[i - 2] * series[i - 2]) % 47;
        }

        // Return the Nth value modulo 47
        return series[input1];
    }

    public static void main(String[] args) {
        // Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Output the Nth number in the special series modulo 47
        int result = specialFibonacci(N);
        System.out.println("The " + N + "th number in the special Fibonacci series is: " + result);
    }
}
