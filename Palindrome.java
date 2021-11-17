
package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String original = "madam";
		String revStr="";
		for (int i = 0; i < original.length(); i++) {
			char temp = original.charAt(i);
			revStr= temp+revStr;
		}
		if (original.equalsIgnoreCase(revStr)) {
			System.out.println("MADAM IS A PALINDROME");
		}
		else {
			System.out.println("MADAM IS NOT PALINDROME");
		}
		}
	}