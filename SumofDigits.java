package Week5;

import java.util.Arrays;

/**
 * @author Mushka Stone
 * 10/25/2023
 * Sum of Digits
 * Write a recursive function to find the sum of the digits of a positive integer. 
 * For example, the sum of the digits in an array of {1,2,3,4,5} would be  (1 + 2 + 3 + 4 + 5) = 15
 */
public class SumofDigits {
	
	public static void main(String[]args) {
		int [] digits = {1,2,3,4,5};
		
		//Make a variable to hold the total
		int total = sum(digits);
		System.out.println("The sum of all the numbers is: " + total);
		
		
	}

	public static int sum(int[] digits) {
		//This if statement is our base case
		if(digits.length == 0) {
			return 0;
		}else {
			//This adds all digits up into the sum. 
			//This is the recursive part.
			return digits[0] + sum(Arrays.copyOfRange(digits, 1, digits.length));
	
		}
		
	}
}