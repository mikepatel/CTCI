import java.util.Arrays;

/*
 * Given 2 strings, find out if one is a permutation of the other 
 * 
 * Notes:
 * 	- strings of different lengths cannot possibly be permutations of each other
 * 	- sort both strings -> permutation strings will be identical
 *  - permutation = rearrangement of letters
 */

public class CheckPermutation {
	// main
	public static void main(String[] args) {
		String in1 = args[0];
		String in2 = args[1];
		
		String a = sort(in1);
		String b = sort(in2);
		
		if(a.length() != b.length()) {
			System.out.println(in1 + " and " + in2 + " are not permutations of each other");
		}
		boolean result = a.equals(b);
		System.out.println(in1 + " and " + in2 + " are permutations of each other? :: " + result);
	}
	
	// sort
	public static String sort(String s) {
		char tempArray[] = s.toCharArray();
		Arrays.sort(tempArray);
		String sorted = new String(tempArray);
		return sorted;
	}
}
