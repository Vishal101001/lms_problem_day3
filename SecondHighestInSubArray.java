package com.lms_problems_day3;

public class SecondHighestInSubArray {

	    public static void main(String[] args) {
	        // Declare and initialize the array
	        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

	        // Define start and end index for the subarray
	        int startIndex = 2;
	        int endIndex = 6;

	        // Get the subarray from index 2 to 6
	        int subArrayLength = endIndex - startIndex + 1;
	        int[] subArray = new int[subArrayLength];

	        int i = 0;
	        int subArrayIndex = startIndex;

	        // Fill the subarray using a while loop
	        while (subArrayIndex <= endIndex) {
	            subArray[i] = arr[subArrayIndex];
	            subArrayIndex++;
	            i++;
	        }

	        // Display the subarray
	        System.out.print("Subarray: ");
	        i = 0;
	        while (i < subArrayLength) {
	            System.out.print(subArray[i] + " ");
	            i++;
	        }
	        System.out.println();

	        // Find the 2nd highest element in the subarray
	        
	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	        i = 0;
	        while (i < subArrayLength) {
	            if (subArray[i] > highest) {
	                secondHighest = highest;
	                highest = subArray[i];
	            } else if (subArray[i] > secondHighest && subArray[i] != highest) {
	                secondHighest = subArray[i];
	            }
	            i++;
	        }

	        // Display the 2nd highest element
	        System.out.println("2nd Highest element: " + secondHighest);
	    }
	}