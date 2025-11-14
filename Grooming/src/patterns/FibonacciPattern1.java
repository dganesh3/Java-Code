package patterns;

import java.util.Scanner;

public class FibonacciPattern1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = sc.nextInt();

        // Generate Fibonacci series
        int[] fibonacci = new int[terms];
        fibonacci[0] = 1;
        fibonacci[1] = 2;

        for (int i = 2; i < terms; i++)
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // Print in the given pattern
        int spaces = 0;
        for (int i = 0; i < terms; i++)
        {
            for (int j = 0; j < spaces; j++)
            {
                System.out.print(" ");
            }
            System.out.println(fibonacci[i]);
            spaces = (spaces + 4) % 8; // Zig-zag increment and reset
        }
        sc.close();
    }
}
