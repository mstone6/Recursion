package Week5;
/**
 * @author Mushka Stone
 * 10/25/2023
 * Counting Down:
 * Write a recursive function that counts down from a given number to 1. For example, if you start with 5, the function 
 * should print: 5, 4, 3, 2, 1.
 */
public class CountingDown {
	
	public static void main(String[]args) {
		int count = 5;
		System.out.println("Counting down:");
		
		//Almost forgot to call the method
		down(count);
	}
	
	public static int down(int count) {
		//This is our base case
		if(count == 0) {
			return 0;
		}else {
			//First it prints out the number and then it subtracts
			//This is the recursive part.
			System.out.println(count);
			return down(count - 1);
			
		}
	}		
}

	

