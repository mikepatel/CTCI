import java.util.Scanner;

/*
 * Determines whether a string consists of all unique characters
 * 
 * Input: string
 * Output: boolean
 * 
 * 
 * Time: O(n) where n is length of string
 * Space: O(n)
 */

public class Unique {

	// Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = in.nextLine();
		
		// check if string has all unique characters
		boolean result = checkIfUnique(input);
		System.out.println("Does " + input + " have all unique characters?");
		System.out.println(result);
		
		in.close();		
	}
	
	//
	public static boolean checkIfUnique(String s) {
		boolean char_set[] = new boolean[256]; // assume ASCII
												// how much data is there?
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i); // charAt() returns char at given index
			if(char_set[c] == true) { // have I seen this char before?
				return false; // yes, seen before, so string cannot be comprised of all unique characters
			}
			char_set[c] = true; // mark that I have now seen this char
		}
		return true;
	}

} // end of class
