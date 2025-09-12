// Title: Factorial Calculator
// Instruction: Write a program that computes the factorial of a positive integer N entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Factorial fct = new Factorial();

        System.out.print("Enter an integer: ");
        int N = scn.nextInt();

        System.out.println("The factorial of " + N + " is " + fct.factorial(N) + ".");

        scn.close();
    }
}