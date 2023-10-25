package Week5;
/**
 * @author Mushka Stone
 * 10/25/2023
 * 
 * Reverse a String
 * Write a recursive function to reverse a given string. For example, if you have the string "hello," the function 
 * should return "olleh."
 */
public class ReverseString {
	
	//FIX THIS!!!!
	public static void main(String[]args) {
		String hello = "hello";
		System.out.println(Reverse(hello));
	}
	
	public static String Reverse(String rev) {
		
		if(rev == null || rev.isEmpty()) {
			return rev;
		}else {
			return rev.charAt(rev.length() -1) + Reverse(rev.substring(0, rev.length() - 1));
		}
		
	}
}
