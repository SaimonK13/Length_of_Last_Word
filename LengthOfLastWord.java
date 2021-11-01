/* Name: Length of Last Word (LeetCode Problem #58)
 * Description: Given a string s consisting of some words separated by some number of spaces,
 * return the length of the last word in the string.
 */
public class LengthOfLastWord {

	//method 1: convert the string into an array and find length of the last element
	static int method1(String s) {
		
		String[] arr = s.split(" ");
		return arr[arr.length-1].length();
		
	}
	
	//method 2 (optimized): count from the last character until space
	static int method2(String s) {
		
		int result = 0;
		int n = s.length();
		
		while(n > 0) {
			if(s.charAt(--n) != ' ') {
				result++;
			}
			
			else 
				return result;
		}
		
		return result;
	}
	
	//main method
	public static void main(String[] args) {
		
		String s = "Hello There";
		System.out.println("Method 1: the length of the last word is " + method1(s));
		System.out.println("Method 2: the length of the last word is " + method2(s));

	}

}
