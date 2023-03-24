package org.example.fibonacci;


    import java.util.Scanner;

    public class fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int numTerms = scanner.nextInt();
            int prev = 0, next = 1;
            System.out.print("Fibonacci Series up to " + numTerms + " terms: ");
            for (int i = 1; i <= numTerms; ++i) {
                System.out.print(prev + " ");
                int sum = prev + next;
                prev = next;
                next = sum;
            }
        }
    }


