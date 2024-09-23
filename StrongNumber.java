package com.lms_problems_day3;
import java.util.Scanner;

public class StrongNumber {
	
	    // Method to calculate factorial of a digit
	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong number
	    public static boolean isStrongNumber(int number) {
	        int originalNumber = number;
	        int sumOfFactorials = 0;

	        // Loop through each digit of the number
	        while (number > 0) {
	            int digit = number % 10;  // Get the last digit
	            sumOfFactorials += factorial(digit);  // Add factorial of the digit
	            number /= 10;  // Remove the last digit
	        }

	        // Check if the sum of the factorials is equal to the original number
	        return sumOfFactorials == originalNumber;
	    }

	    public static void main(String[] args) {
	        // Create Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the entered number is a Strong number
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


