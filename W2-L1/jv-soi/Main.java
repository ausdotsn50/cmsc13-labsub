// Title: Sum of Integers
// Instruction: Write a program that computes the sum of all integers from 1 to N, where N is entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SOI soi = new SOI();

        System.out.print("Enter an integer: ");
        int N = scn.nextInt();

        System.out.println("The sum of all integers from 1 to " + N + " is " + soi.sumOfIntegers(N) + ".");

        scn.close();
    }
}